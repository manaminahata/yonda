package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.UserMapper;

@Controller
@RequestMapping("/users")
public class TestController {

	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/find-all")
	public String findAll() {
		
		System.out.println("ユーザーの全件検索：");
		System.out.println(userMapper.findAll());
		
		return "OK";
	}
}
