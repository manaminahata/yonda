package com.example.demo.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.domain.Book;
import com.example.demo.domain.User;
import com.example.demo.form.BookRegistrationForm;
import com.example.demo.service.BookRegistrationService;

/**
 * 書籍登録を行うコントローラークラス
 * @author manami
 *
 */
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
		categoryMap.put(15, "その他");
		
		model.addAttribute("categoryMap", categoryMap);
		
		return "book-registration";
	}
	
	/**
	 * 書籍登録
	 * @return
	 */
	@RequestMapping("/book-registration-result")
	public String registerBook(@Validated BookRegistrationForm form, BindingResult result, MultipartFile bookImg, Model model) throws IOException {
		
		// バリデーションチェック
		if (result.hasErrors()) {
			return registrationBook(model);
		}
		
		// 登録された画像データからファイル名を取得
		String bookImgName = form.getBookImg().getOriginalFilename();
		
		System.out.println("ファイル名の確認：");
		System.out.println(bookImgName);
		
//		Path filePath = Paths.get("/Users/manami/workspace/yonda/books/" + bookImgName);
		File filePath = new File(bookImg.getOriginalFilename());
		
		// 保存先を定義
		String uploadPath = "/Users/manami/workspace/yonda/books/";
		
		// アップロードファイルをバイト値に変換
		byte[] bytes = form.getBookImg().getBytes();
		
		// バイト値を書き込むためのファイルを作成して指定したパスに格納
//		OutputStream stream = Files.newOutputStream(filePath);
		BufferedOutputStream stream = new BufferedOutputStream (
				new FileOutputStream(new File(uploadPath + filePath)));
		
		// ファイルに書き込み
		stream.write(bytes);
		
		Book book = new Book();
		
		// formのデータをbookに書き込み
		BeanUtils.copyProperties(form, book);
		
		// sessionに格納されたユーザーデータを利用し、ユーザーのID情報を取得する
		User user = (User) session.getAttribute("user");
		book.setBookUserId(user.getUserId());
		
		// 画像の名前
		book.setBookImgName(bookImgName);
		// 画像のデータをDBに格納
		book.setBookImg(Base64.encodeBase64(form.getBookImg().getBytes()));
		
		session.setAttribute("book", book);
		bookRegistrationService.insertBook(book);
		
		return "book-list";
	}
}
