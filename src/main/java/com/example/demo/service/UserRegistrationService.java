package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserMapper;

@Service
public class UserRegistrationService {
	
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 登録済みのメールアドレスかチェックする
	 * @return
	 */
	public List<User> findByEmail(String email) {
		List<User> userList = userMapper.findAll();
		List<User> user = userList.stream()
			.filter(i -> i.getUserEmail().equals(email))
			.collect(Collectors.toList());
		return user;
	}
	
	public void insertUser(User user) {
		userMapper.insertUser(user);
	}
	
}
