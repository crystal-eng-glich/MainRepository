package com.yuxiu.edu.service.base;

import org.springframework.beans.factory.annotation.Autowired;

import com.yuxiu.edu.mapper.UserMapper;
import com.yuxiu.entity.User;

public abstract class IBaseServiceImpl<T> implements IBaseService<User> {

	//ͳһ����Dao
	@Autowired
	protected UserMapper userMapper;
}
