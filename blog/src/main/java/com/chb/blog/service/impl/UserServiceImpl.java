package com.chb.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chb.blog.bean.User;
import com.chb.blog.mapper.UserMapper;
import com.chb.blog.service.UserService;
@Service
public class UserServiceImpl implements UserService{
@Autowired
UserMapper userMapper;
@Override
    public boolean checkUser(String username) {
		User user =  userMapper.findUsernameByUsername(username);
		if(user != null){
			return false;
		}
		return true;
	}
@Override 
public void insertUser(User user) {
	userMapper.insertUser(user);
	
}

}
