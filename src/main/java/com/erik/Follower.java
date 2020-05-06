package com.erik;

import java.util.List;

public class Follower {
	
	private Integer id;	
	private List<Follower> followerList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Follower> getFollowerList() {
		return followerList;
	}

	public void setFollowerList(List<Follower> followerList) {
		this.followerList = followerList;
	}	
}