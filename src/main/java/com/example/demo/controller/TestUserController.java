package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.User;
import com.example.demo.repository.UserMapper;

@Controller
@RequestMapping("/users")
public class TestUserController {

	@Autowired
	private UserMapper userMapper;
	
//	@RequestMapping("/insertUser")
//	public String insert() {
//		
//		User user = new User();
//		
//		user.setUserName("まな");
//		user.setUserEmail("mana@sample.com");
//		user.setUserPassword("manamana123");
//		
//		userMapper.insertUser(user);
//		
//		return "redirect:/users/find-all";
//	}
//	
//	@RequestMapping("/findAll")
//	public String findAll() {
//		
//		System.out.println("findAll：");
//		System.out.println(userMapper.findAll());
//		
//		return "OK";
//	}
//	
//	@RequestMapping("/findById")
//	public String findByID() {
//		System.out.println("findById：");
//		System.out.println(userMapper.findById(1));
//		return "OK";
//	}
//	
//	@RequestMapping("/findByEmailAndPassword")
//	public String findByEmailAndPassword() {
//		System.out.println("findByEmailAndPassword：");
//		System.out.println(userMapper.findByEmailAndPassword("tarou@sample.com", "taro1234"));
//		return "OK";
//	}
//	
//	@RequestMapping("/updateUser")
//	public String updateUser() {
//		User user = new User();
//		user.setUserId(1);
//		user.setUserPassword("tarou1234");
//
//		userMapper.updateUser(user);
//		
//		System.out.println("updateUser：");
//		System.out.println(userMapper.findById(1));
//		
//		return "OK";
//	}
}
