package com.yuxiu.edu.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.yuxiu.edu.service.IUserService;
import com.yuxiu.entity.User;

@Controller
@RequestMapping("/user")
public class UserController{
	@Autowired
	protected IUserService userService;

	@RequestMapping("/login")
	public String login() {
		System.out.println("login....");
		return "result";
	}
	
	@RequestMapping("/queryForId")
	public String findById(@RequestParam("id") Integer id,Model model) {
		User user = userService.findById(id);
		List<User> result = new ArrayList<User>();
		result.add(user);
		model.addAttribute("result",result);
		return "result";
	}
	
}
