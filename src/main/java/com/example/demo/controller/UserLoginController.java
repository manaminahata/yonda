package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.User;
import com.example.demo.form.UserLoginForm;
import com.example.demo.service.UserLoginService;

/**
 * ユーザーのログイン・ログアウト認証を行うコントローラークラス
 * @author manami
 *
 */
@Controller
@RequestMapping("/yonda")
public class UserLoginController {
	
	@Autowired
	private HttpSession session;
	
	@Autowired
	private UserLoginService userLoginService;
	
	@ModelAttribute
	public UserLoginForm userLoginForm() {
		return new UserLoginForm();
	}
	
	/**
	 * アクセス時のデフォルトの画面を表示する
	 * @return ログイン画面を表示する。
	 */
	@RequestMapping("/user-login")
	public String index() {
		return "user-login";
	}
	
	/**
	 * ログイン認証を実行
	 * @param form
	 * @param model
	 * @return 正常にログインされた場合、ホーム画面に進み、それ以外はログイン画面に戻る
	 */
	@RequestMapping("/user-login-result")
	public String loginUser(UserLoginForm form, Model model) {
		
		User user = userLoginService.loginUser(form.getUserEmail(), form.getUserPassword());
		
		if (user == null) {
			model.addAttribute("errorMessage", "メールアドレスまたはパスワードが不正です");
			return index();
		}
		
		BeanUtils.copyProperties(form, user);
		session.setAttribute("user", user);
		
		// セッションが値を保持していれば、ホーム画面に進むことができる
		if (session.getAttribute("user") != null) {
			return "redirect:/yonda/home";
		}
		
		return "redirect:/yonda/user-login";
	}
	
	/**
	 * ログアウト処理を実行
	 * @return セッションに格納された情報を削除し、ログイン画面を表示する
	 */
	@RequestMapping("user-logout")
	public String logoutUser() {
		session.invalidate();
		return "redirect:/yonda/user-login";
	}
}
