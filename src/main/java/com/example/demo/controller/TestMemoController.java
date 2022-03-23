//package com.example.demo.controller;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.example.demo.domain.Memo;
//import com.example.demo.repository.MemoMapper;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//
//@Controller
//@RequestMapping("/memo")
//public class TestMemoController {
//
//	@Autowired
//	private MemoMapper memoMapper;
//	
////	@RequestMapping("/insertMemo")
////	public String insertMemo() {
////		Memo memo = new Memo();
////		memo.setMemoBookId(4);
////		memo.setMemoBody("メモの追加テスト");
////		memoMapper.insertMemo(memo);
////		
////		System.out.println("insertMemo：");
////		System.out.println(memoMapper.findAll());
////		
////		return "OK";
////	}
//	
//	@RequestMapping("/updateMemo")
//	public String updateMemo() {
//		Memo memo = new Memo();
//		memo.setMemoId(1);
//		memo.setMemoBody("メモの内容修正テスト");
//		memoMapper.updateMemo(memo);
//		
//		System.out.println("updateMemo：");
//		System.out.println(memoMapper.findAll());
//		
//		return "OK";
//	}
//}
