package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Book;
import com.example.demo.repository.BookMapper;

@Service
public class BookListService {

	@Autowired
	private BookMapper bookMapper;
	
	public List<Book> findAll() {
		return bookMapper.findAll();
	}
	
	public List<Book> findByOne(Integer userId) {
		return bookMapper.findByOne(userId);
	}
}
