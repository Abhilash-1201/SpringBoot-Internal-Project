package com.example.springjspdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@RequestMapping(value ="/welcome", method=RequestMethod.GET)
	public String WelcomePage() {
		return "welcome";
	}
	
	@RequestMapping(value ="/login", method=RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value ="/login", method=RequestMethod.POST)
	public String welcomePage(ModelMap model, @RequestParam String userid, @RequestParam String password) {
		if(userid.equals("admin") && password.equals("root")) {
			model.put("userid", userid);
			return "login";
		}
		return "error";
	}
	
}
