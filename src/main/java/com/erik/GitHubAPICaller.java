package com.erik;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GitHubAPICaller {
	
	private static String URL = "https://api.github.com";
	private static String USER = "/user/";
	private static String FOLLOWERS = "/followers";
	private static String PARAMETERS = "?page=1&per_page=5";
	
	/**
	 * Requests followers from GitHub API, given a GitHub ID
	 * @param id {@link Integer} GitHub ID
	 * @return {@link Follower[]} List of 5 Followers
	 */
	public Follower[] getFollowers(Integer id) {
		
		String endpoint = URL + USER + id + FOLLOWERS + PARAMETERS;
		RestTemplate restTemplate = new RestTemplate();
		Follower[] followerArray = restTemplate.getForObject(endpoint, Follower[].class);
		
		return followerArray;
	}
}