package com.erik;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.MediaType;

@Controller
public class FollowersController {
	
	@Autowired
	private FollowersService followersService;
	
	/**
	 * Gets followers of user, 3 deep
	 * @param id {@link Integer} user identifier for looking up followers
	 * @return {@link List} list of follower ids
	 */
	@GetMapping(path = "/followers", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody List<Follower> followers(
            @RequestParam(value = "id", required = true) Integer id) {
		List<Follower> response = followersService.findGitHubIDs(id);
		
		return response;
	}
}