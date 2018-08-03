package com.yanxml.maven.quickstart;

import org.apache.commons.lang3.StringUtils;

public class QuickStart {
	
	public static void main(String[] args) {
		String hello = null;
		if(StringUtils.isBlank(hello)){
			System.out.println("Null String.");
		}else{
			System.out.println("Not Null String.");
		}
	}

}
