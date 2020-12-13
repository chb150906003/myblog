package com.chb.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chb.blog.bean.User;
import com.chb.blog.service.UserService;
@RestController
public class RegisterController {
	@Autowired
	UserService userService;
@PostMapping("save")
public String save(@RequestBody User user){
	String reason = "注册成功";
/*	String authCode = request.getParameter("authCode");
    String trueMsgCode = (String) request.getSession().getAttribute("trueMsgCode");
    String username = (String) request.getSession().getAttribute("userName");
    if(!authCode.equals(trueMsgCode)){
    	reason = "注册失败，验证码错误！";
    }*/
    if(!userService.checkUser(user.getUsername())){
    	reason = "注册失败，用户已存在，请勿再次注册！";
    }else{
    	userService.insertUser(user);
    }
	return reason;
	}
}
