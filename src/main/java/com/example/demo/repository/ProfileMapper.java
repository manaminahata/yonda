package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Profile;

@Mapper
public interface ProfileMapper {
	
	/** プロフィール画像の登録 */
	public void insertProfile(Profile profile);
	
	/** プロフィール画像の全件取得（おそらく使用用途はほとんどなし） */
	public List<Profile> findAll();
	
	/** プロフィール画像の更新 */
	public void updateProfile(Profile profile);
}
