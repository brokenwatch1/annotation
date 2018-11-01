package com.search.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortByArr {
	
	public static void main(String[] args) {
		List<User> list = new ArrayList<>();
		User u1 = new User("1", "张三");
		User u2 = new User("2", "李四");
		User u3 = new User("3", "王五");
		User u4 = new User("4", "赵六");
		User u5 = new User("4", "翠花");
		User u6 = new User("4", "麻子hua");
		list.add(u6);
		list.add(u1);
		list.add(u5);
		list.add(u2);
		list.add(u3);
		list.add(u4);
		
		List<String> listInt = new ArrayList<>();
		listInt.add("麻子");
		listInt.add("王五");
		listInt.add("李四");
		listInt.add("赵六");
		
		sortListByArr(list,listInt);
		System.out.println(list.toString());
		//sortArr();
		//System.out.println(runturnTest());
	}
	
	public static List<User> sortListByArr(List<User> list,List<String> listArr){
		//List<User> sortList = new ArrayList<>();
		for(int i =0; i < list.size(); i++){
			for(int j = i+1; j < list.size(); j++){
				String iName = list.get(i).getName();
				String jName = list.get(j).getName();
				if(compareString(iName,jName,listArr)){
					Collections.swap(list, i, j);
				}
			}
		}
		return list;
	}
	
	
	private static boolean compareString(String iName, String jName,List<String> listArr) {
		int i = findNode(iName,listArr);
		int j = findNode(jName,listArr);
		if(i == -1){
			return true;
		}else{
			if(i > j && j != -1){
				return true;
			}
		}
		return false;
	}
	
	private static int findNode(String name,List<String> listArr){
		int i = -1;
		for(int k =0; k < listArr.size(); k++){
			if(name.contains(listArr.get(k))){
				i = k;
				break;
			}
		}
		return i;
	}

}
