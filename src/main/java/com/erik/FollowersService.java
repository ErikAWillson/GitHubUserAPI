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
		return createFollowersList(follower, 0);
	}


	/**
	 Recursive method for finding followers of users
	 */
	private List<Follower> createFollowersList(Follower user, int level) {
		List<Follower> userList = new ArrayList<Follower>();
		if (level >= LEVEL_LIMIT) return userList;

		user.setFollowerList(Arrays.asList(gitHubAPICaller.getFollowers(user.getId())));
		for (Follower follower : user.getFollowerList())
			createFollowersList(follower, level + 1);

		userList.add(user);
		return userList;
	}
}