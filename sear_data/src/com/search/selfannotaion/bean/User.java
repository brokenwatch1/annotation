package com.search.selfannotaion.bean;

import com.search.selfannotaion.annotation.JobAno;
import com.search.selfannotaion.dao.JobDao;

public class User {
	
	private String id;
	private String name;
	
	
	@JobAno(beanClass=JobDao.class,targetfiled="job",paramfiled="id", methodName = "findJob")
	private String job;
	
	public User(String id, String name, String job) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", job=" + job + "]";
	}
	
	
	
}
