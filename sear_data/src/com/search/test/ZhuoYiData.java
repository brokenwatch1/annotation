package com.search.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ZhuoYiData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			String url = "http://bbs.zysjjy.com/forum.php?mod=viewthread&tid=1527&extra=page%3D1";
			String content = getContent(url);
			System.out.println(content);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static String getContent(String url) throws Exception{
		URL relUrl = new URL(url);
		URLConnection conn = relUrl.openConnection();
		InputStream inputStream = conn.getInputStream();
		String line = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
		StringBuffer content = new StringBuffer();
		while((line = br.readLine())!=null){
			content.append(line);
		}
		return content.toString();
	}

}
