package com.search.selfannotaion.dao;

import com.search.selfannotaion.bean.Job;

public class JobDao {
	
	public Job findJob(String id){
		if(id == "1"){
			return new Job("1","程序员");
		}
		if(id == "2"){
			return new Job("2","老板");
		}
		return null;
	}
}
