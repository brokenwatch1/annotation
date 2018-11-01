package com.search.test;

public class User {
	private String id;
	private String name;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public User(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
