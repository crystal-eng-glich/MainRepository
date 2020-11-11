package com.yuxiu.edu.service;

import org.springframework.stereotype.Service;

import com.yuxiu.edu.service.base.IBaseServiceImpl;
import com.yuxiu.entity.User;

@Service
public class IUserServiceImpl extends IBaseServiceImpl<User> implements IUserService {

	public User findById(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.findById(id);
	}

	public User finById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public void deleteByUUId(String id) {
		// TODO Auto-generated method stub
		
	}

	public void update(User t) {
		// TODO Auto-generated method stub
		
	}

	public void insert(User t) {
		// TODO Auto-generated method stub
		
	}

	public User login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
