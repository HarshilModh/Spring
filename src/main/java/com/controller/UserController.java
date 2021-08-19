package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.UserBean;

@Controller
public class UserController {
	
	@RequestMapping(value ="/WEB-INF/views/Addition", method =RequestMethod.GET)
	public String loadAddition	() {
		return "Addition";
	}
@PostMapping("/Add")
//	@GetMapping("/Add")
public String add(UserBean bean,Model model){
	
	System.out.println(bean.getNo1());
	System.out.println(bean.getNo2());
	model.addAttribute("result",bean.getNo1()+bean.getNo2());
	return "Home";
	
	
}
}
