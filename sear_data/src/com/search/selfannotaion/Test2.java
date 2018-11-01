package com.search.selfannotaion;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.UUID;

import com.search.selfannotaion.bean.User;
import com.search.selfannotaion.dao.UserDao;
import com.search.selfannotaion.dao.UserDaoImpl;
import com.search.selfannotaion.proxy.ProxyClass;

public class Test2 {
	
	public static void main(String[] args) throws Exception {
		UserDaoImpl udi = new UserDaoImpl();
		UserDao ud = (UserDao) new ProxyClass().bind(new UserDaoImpl());
		List<User> selectUser = ud.selectUser();
	}
}
