//package com.example.demo.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.example.demo.domain.Book;
//import com.example.demo.repository.BookMapper;
//
//@Controller
//@RequestMapping("/books")
//public class TestBookController {
//
//	@Autowired
//	private BookMapper bookMapper;
//	
////	@RequestMapping("/insertBook")
////	public String insertBook() {
////		Book book = new Book();
////		book.setBookName("SQLアンチパターン");
////		book.setBookCategoryId(5);
////		book.setBookPrice(3200);
////		book.setBookPage(352);
////		book.setBookImage(null);
////		book.setBookUserId(1);
////		bookMapper.insertBook(book);
////		
////		System.out.println("insertBook：");
////		System.out.println(bookMapper.findAll());
////		
////		return "OK";
////	}
////	
////	@RequestMapping("/findByOne")
////	public String findByOne() {
////		System.out.println("findByOne：");
////		System.out.println(bookMapper.findByOne(1));
////		return "OK";
////	}
////	
////	@RequestMapping("/findById")
////	public String findById() {
////		System.out.println("findById：");
////		System.out.println(bookMapper.findById(1, 3));
////		return "OK";
////	}
////	
////	@RequestMapping("/findByName")
////	public String findByName() {
////		System.out.println("findByName：");
////		System.out.println(bookMapper.findByName(1, "SQL"));
////		return "OK";
////	}
//	
//	@RequestMapping("/updateBook")
//	public String updateBook() {
//		Book book = new Book();
//		book.setBookId(1);
//		book.setBookCategoryId(5);
//		book.setBookUserId(1);
//		bookMapper.updateBook(book);
//		
//		System.out.println("updateBook：");
//		System.out.println(bookMapper.findById(1, 1));
//		
//		return "OK";
//	}
//}
