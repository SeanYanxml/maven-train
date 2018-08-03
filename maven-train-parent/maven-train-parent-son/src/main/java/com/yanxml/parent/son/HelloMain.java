package com.yanxml.parent.son;

import com.yanxml.parent.util.StringUtil;

public class HelloMain {
	public static void main(String[] args) {
		String string = "hello";
		
		// StringUtil 自己写的工具类(maven-train-parent-util)
		if(StringUtil.isEmpty(string)){
			System.out.println("String is null");
		}else{
			System.out.println("String is not null.");
		}
	}

}
