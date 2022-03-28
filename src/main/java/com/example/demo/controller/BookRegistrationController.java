package com.example.demo.controller;

import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Book;
import com.example.demo.domain.User;
import com.example.demo.form.BookRegistrationForm;
import com.example.demo.service.BookRegistrationService;

@Controller
@RequestMapping("/yonda")
public class BookRegistrationController {
	
	@Autowired
	private HttpSession session;
	
	@Autowired
	private BookRegistrationService bookRegistrationService;
	
	@ModelAttribute
	public BookRegistrationForm bookRegistrationForm() {
		return new BookRegistrationForm();
	}
	
	/**
	 * 書籍登録画面の表示
	 * @return
	 */
	@RequestMapping("/book-registration")
	public String registrationBook(Model model) {
		
		Map<Integer, String> categoryMap = new TreeMap<>();
		categoryMap.put(0, "--カテゴリーを選択してください--");
		categoryMap.put(1, "雑誌");
		categoryMap.put(2, "コミック");
		categoryMap.put(3, "ビジネス・経済");
		categoryMap.put(4, "アート・建築・デザイン");
		categoryMap.put(5, "IT・コンピュータ");
		categoryMap.put(6, "文庫");
		categoryMap.put(7, "単行本");
		categoryMap.put(8, "文芸本");
		categoryMap.put(9, "エッセイ・随筆");
		categoryMap.put(10, "趣味・実用");
		categoryMap.put(11, "暮らし・健康");
		categoryMap.put(12, "旅行・アウトドア");
		categoryMap.put(13, "児童書");
		categoryMap.put(14, "参考書");
		categoryMap.put(14, "その他");
		
		model.addAttribute("categoryMap", categoryMap);
		
		return "book-registration";
	}
	
	/**
	 * 書籍登録
	 * @return
	 */
	@RequestMapping("/book-registration-result")
	public String registerBook(@Validated BookRegistrationForm form, BindingResult result, Model model) {
		
		System.out.println("書籍登録form：");
		System.out.println(form);
		
		if (result.hasErrors()) {
			return "book-registration";
		}
		
		Book book = new Book();
		BeanUtils.copyProperties(form, book);
		
		// sessionに格納されたユーザーデータを利用し、ユーザーのID情報を取得する
		User user = (User) session.getAttribute("user");
		book.setBookUserId(user.getUserId());
		
		model.addAttribute("book", book);
		bookRegistrationService.insertBook(book);
		
		return "book-list";
	}
}
