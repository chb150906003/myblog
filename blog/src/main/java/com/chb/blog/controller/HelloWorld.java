package com.chb.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

@GetMapping("getHelloWorld") 
public String getHelloWorld(@RequestParam("name")String name){
	
	String  a ="您好" +name ;
	
	return a;
	}	
	
}
