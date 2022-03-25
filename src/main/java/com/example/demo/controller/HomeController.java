package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ホーム画面上での処理を実行するコントローラークラス
 * @author manami
 *
 */
@Controller
@RequestMapping("/yonda")
public class HomeController {
	
	@Autowired
	private HttpSession session;
	
	/**
	 * ログイン後のホーム画面を表示する
	 * @return
	 */
	@RequestMapping("/home")
	public String home() {
		
		// セッションが値を保持している場合、home画面を表示する
		if (session.getAttribute("user") == null) {
			return "redirect:/yonda/user-login";
		}

		return "home";
	}
}
