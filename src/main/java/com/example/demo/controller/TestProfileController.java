//package com.example.demo.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.example.demo.domain.Profile;
//import com.example.demo.repository.ProfileMapper;
//
//@Controller
//@RequestMapping("/profile")
//public class TestProfileController {
//	
//	@Autowired
//	private ProfileMapper profileMapper;
//	
////	@RequestMapping("/insertProfile")
////	public String insertProfile() {
////		Profile profile = new Profile();
////		profile.setProfileUserId(1);
////		profile.setProfilePic("hanako.png");
////		profileMapper.insertProfile(profile);
////		
////		System.out.println("insertProfile：");
////		System.out.println(profileMapper.findAll());
////		
////		return "OK";
////	}
//	
//	@RequestMapping("/updateProfile")
//	public String updateProfile() {
//		Profile profile = new Profile();
//		profile.setProfileUserId(1);
//		profile.setProfilePic("tarou.png");
//		profileMapper.updateProfile(profile);
//		
//		System.out.println("updateProfile：");
//		System.out.println(profileMapper.findAll());
//		
//		return "OK";
//	}
//}
