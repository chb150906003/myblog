package com.chb.blog.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.chb.blog.bean.User;

@Mapper
@Repository
public interface UserMapper {
	@Select("select * from user where username=#{username}")
    User findUsernameByUsername(@Param("username") String username);
	@Insert("insert into user(phone,username,password,gender,avatarImgUrl) values(#{phone},#{username},#{password},#{gender},#{avatarImgUrl})")
	void insertUser(User user);
}
