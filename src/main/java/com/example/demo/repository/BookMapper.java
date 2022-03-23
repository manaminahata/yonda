package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.domain.Book;

@Mapper
public interface BookMapper {

	/** 書籍登録 */
	public void insertBook(Book book);
	
	/** 書籍情報の全件取得（全ユーザーの書籍情報） */
	public List<Book> findAll();
	
	/** 特定ユーザーの書籍情報を全件取得 */
	public List<Book> findByOne(@Param("bookUserId") Integer bookUserId);
	
	/** 特定のユーザーの中から書籍idが一致する書籍情報の取得 */
	public Book findById(@Param("bookUserId") Integer bookUserId, @Param("bookId") Integer bookId);
	
	/** 書籍名が一致する情報の取得 */
	public List<Book> findByName(@Param("bookUserId") Integer bookUserId, @Param("bookName") String bookName);
	
	/** 書籍情報の更新 */
	public void updateBook(Book book);
}
