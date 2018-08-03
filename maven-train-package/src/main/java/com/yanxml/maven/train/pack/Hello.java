package com.yanxml.maven.train.pack;

import org.apache.commons.lang3.StringUtils;

public class Hello {
	public static void main(String[] args) {
		String hello = "hello";
		if(StringUtils.isBlank(hello)){
			System.out.println("Black hello.");
		}else{
			System.out.println("Not Black hello.");
		}
	}

}
