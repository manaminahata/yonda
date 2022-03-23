package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Memo;

@Mapper
public interface MemoMapper {

	/** メモの登録 */
	public void insertMemo(Memo memo);
	
	/** メモの全件取得 */
	public List<Memo> findAll();
	
	/** メモの更新 */
	public void updateMemo(Memo memo);
}