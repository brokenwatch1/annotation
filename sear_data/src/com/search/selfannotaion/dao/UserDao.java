package com.search.selfannotaion.dao;

import java.util.List;

import com.search.selfannotaion.annotation.aopAfter;
import com.search.selfannotaion.bean.User;

public interface UserDao {
	
	@aopAfter
	public List<User> selectUser();
}
