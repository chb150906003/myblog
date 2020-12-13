package com.chb.blog.service;

import org.springframework.transaction.annotation.Transactional;

import com.chb.blog.bean.User;

public interface UserService {
boolean checkUser(String username);
@Transactional
void insertUser(User user);
}
