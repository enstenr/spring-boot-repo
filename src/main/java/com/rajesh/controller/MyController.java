package com.rajesh.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rajesh.service.IService;


@Controller
public class MyController {
	@Autowired
	IService serviceObj;
	@GetMapping("/welcome")
	public String welcomeMethod(
			@RequestParam(name="name",required=false,defaultValue = "Welcome") String name, Model model) {
		model.addAttribute("name",name);
		serviceObj.login();
		
		return "welcomepage";
	}
}
