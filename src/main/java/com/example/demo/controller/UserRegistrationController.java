package com.example.demo.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.User;
import com.example.demo.form.UserRegistrationForm;
import com.example.demo.service.UserRegistrationService;

@Controller
@RequestMapping("/yonda")
public class UserRegistrationController {
	
	@Autowired
	private UserRegistrationService userRegistrationService;
	
	@ModelAttribute
	public UserRegistrationForm userRegistrationForm() {
		return new UserRegistrationForm();
	}
	
	/**
	 * ユーザー登録画面の表示
	 * @return
	 */
	@RequestMapping("/user-registration")
	public String registrationUser() {
		return "user-registration";
	}
	
	/**
	 * ユーザー登録
	 * @return
	 */
	@RequestMapping("user-registration-result")
	public String registerUser(@Validated UserRegistrationForm form, BindingResult result, Model model) {
		
		// formで設定した入力値チェック
		if (result.hasErrors()) {
			return "user-registration";
		}
		
		// 既に使用されているメールアドレスかチェック
		if ((userRegistrationService.findByEmail(form.getUserEmail()).isEmpty()) == false) {
			model.addAttribute("errorEmail", "このメールアドレスは既に利用されています");
			return "user-registration";
		}
		
		// パスワードと確認用パスワードが一致しているかチェックする
		if (!(form.getUserPassword().equals(form.getUserConfirmPassword()))) {
			model.addAttribute("errorCheckPass", "パスワードが一致していません");
			return "user-registration";
		}
		
		//問題がなければユーザーを登録する
		User user = new User();
		BeanUtils.copyProperties(form, user);
		userRegistrationService.insertUser(user);
		
		return "redirect:/yonda/confirm";
	}
	
	/**
	 * 登録内容確認画面の表示
	 * @return
	 */
	@RequestMapping("/confirm")
	public String confirmUser() {
		return "user-confirm";
	}

}
