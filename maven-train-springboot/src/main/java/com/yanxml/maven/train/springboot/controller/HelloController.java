package com.yanxml.maven.train.springboot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping(method=RequestMethod.GET,value="/control/hello")
	@ResponseBody
	public String Hello(HttpServletRequest request){
		int i = 0;
		i=i+1;
		return "Hello";
	}

}
