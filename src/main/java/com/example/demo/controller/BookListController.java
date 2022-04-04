package com.example.demo.controller;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.codec.binary.Base64;
import org.apache.tomcat.util.file.ConfigurationSource.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.converter.BufferedImageHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.domain.Book;
import com.example.demo.domain.User;
import com.example.demo.service.BookListService;


@Controller
@RequestMapping("/yonda")
public class BookListController {

	@Autowired
	private HttpSession session;
	
	@Autowired
	private ResourceLoader resourceLoader;
	
	@Autowired
	private BookListService bookListService;
	
	
	@RequestMapping("/book-list")
	public String bookList(MultipartFile multipartFile, Model model) throws IOException {
		
		// ユーザーのIDを取得する
		User user = (User)session.getAttribute("user");
		Integer userId = user.getUserId();
		
		// ユーザーIDが一致する書籍情報を取得する
		List<Book> bookList = bookListService.findByOne(userId);
		
		model.addAttribute("bookList", bookList);
		
//		// ファイルインスタンスを取得し、ImageIOに読み込ませる
//		for (int i = 0; i < bookList.size() ; i++) {
//			
//			System.out.println("出力チェック1");
//			
//			File FilePath = new File(multipartFile.getOriginalFilename());
//			
//			System.out.println("FilePath：");
//			System.out.println(FilePath);
//			
//			// 保存先を定義
//			String uploadPath = bookList.get(i).getBookImgName();
//			byte[] byteBookImg = bookList.get(i).getBookImg();
//			
//			// 指定フォルダへ読み込みファイルを書き込む
//			BufferedOutputStream stream = new BufferedOutputStream (
//					new FileOutputStream(new File(uploadPath + FilePath)));
//			stream.write(byteBookImg);
//			stream.close();
//			
//			System.out.println("出力チェック2");
//			
//			bookImgList.add(FilePath.toString());
//			
//			System.out.println("出力チェック3");
//			
//		}
//		
//		model.addAttribute("bookImgList", bookImgList);
		
//		System.out.println("bookImgList：");
//		System.out.println(bookImgList);

		
		return "book-list";
	}
}
