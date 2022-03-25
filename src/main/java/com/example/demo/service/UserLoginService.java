package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserMapper;

/**
 * ユーザーのログイン・ログアウトを行うサービスクラス
 * @author manami
 *
 */
@Service
public class UserLoginService {

	@Autowired
	private UserMapper userMapper;
	
	/**
	 * メールアドレスとパスワードが一致したユーザーを取得する
	 * @param email
	 * @param password
	 * @return 引数のメールアドレスとパスワードと一致するユーザー情報
	 */
	public User loginUser(String email, String password) {
		return userMapper.findByEmailAndPassword(email, password);
	}
}
