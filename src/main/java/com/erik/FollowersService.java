package com.erik;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class FollowersService {
	
	@Autowired
	private GitHubAPICaller gitHubAPICaller;
	
	// Determines how many levels of followers the service finds
	private final int LEVEL_LIMIT = 3;
	
	/**
	 * Finds GitHub identifiers of users followers, 3 deep
	 * @param id {@link Integer} user identifier for looking up followers
	 * @return {@link List} list of follower ids
	 */
	public List<Follower> findGitHubIDs(Integer id) {
		Follower follower = new Follower();
		follower.setId(id);
		return processIds(follower, 0);
	}
	
	 
	// Recursive method for finding followers of users
	private List<Follower> processIds(Follower user, int level) {
		if (level >= LEVEL_LIMIT) {
			// No deeper!
			return null;
		}
		
		// Use Id to get followers
		Follower[] followerArray = gitHubAPICaller.getFollowers(user.getId());
		
		// Set followers to users followerList
		List<Follower> followerList = Arrays.asList(followerArray);		
		user.setFollowerList(followerList);
		
		// For each follower, go through the same process
		for (Follower follower : user.getFollowerList()) {
			processIds(follower, level + 1);
		}
		
		// Put idNode into a List, and return
		List<Follower> userList = new ArrayList<Follower>();
		userList.add(user);
		return userList;
	}
}