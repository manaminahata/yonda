package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Book;
import com.example.demo.repository.BookMapper;

/**
 * 書籍登録処理を行うサービスクラス
 * @author manami
 *
 */
@Service
public class BookRegistrationService {
	
	@Autowired
	private BookMapper bookMapper;
	
	/**
	 * 書籍登録処理
	 * @param book
	 */
	public void insertBook(Book book) {
		bookMapper.insertBook(book);
	}
}
