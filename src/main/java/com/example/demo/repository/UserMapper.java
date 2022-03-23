package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.domain.User;

@Mapper
public interface UserMapper {
	
	/** ユーザー登録 */
	public void insertUser(User user);
	
	/** ユーザー情報の全件検索 */
	public List<User> findAll();
	
	/** 取得したidと一致するユーザー情報の取得 */
	public User findById(@Param("userId") Integer id);
	
	/** 取得したメールアドレスとパスワードに一致するユーザー情報の取得 */
	public User findByEmailAndPassword(@Param("userEmail") String userEmail, @Param("userPassword") String userPassword);
	
	/** ユーザー情報の更新 */
	public void updateUser(User user);
}
