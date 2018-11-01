package com.search.selfannotaion.dao;

import java.util.ArrayList;
import java.util.List;

import com.search.selfannotaion.annotation.aopAfter;
import com.search.selfannotaion.bean.User;

public class UserDaoImpl implements UserDao{
	
	public List<User> selectUser(){
		List<User> list = new ArrayList<>();
		User user1 = new User("1","张三","1");
		User user2 = new User("2","李四","2");
		User user3 = new User("3","王五","3");
		list.add(user1);
		list.add(user2);
		list.add(user3);
		return list;
	}

}
