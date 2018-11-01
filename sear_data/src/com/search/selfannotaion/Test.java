package com.search.selfannotaion;

import java.util.ArrayList;
import java.util.List;
import com.search.selfannotaion.bean.User;
import com.search.selfannotaion.dao.UserDao;
import com.search.selfannotaion.dao.UserDaoImpl;
import com.search.selfannotaion.proxy.ProxyClass;
import com.search.selfannotaion.utils.BeanUtils;

public class Test {
	
	public static void main(String[] args) throws Exception{
		
		UserDao ud = (UserDao) new ProxyClass().bind(new UserDaoImpl());
		List<User> selectUser = ud.selectUser();
		System.out.println(selectUser.toString());
	}
}
