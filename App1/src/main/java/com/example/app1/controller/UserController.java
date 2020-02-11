package com.example.app1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app1.model.User;
import com.example.app1.service.UserService;

@Controller
@RequestMapping("/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping({"/","/login"})
	public String index() {
		return "index";
	}
	
	@GetMapping("/userForm")
	public String getUserForm(Model model) {
		model.addAttribute("userList", userService.getAllUsers());
		//model.addAttribute("listTab", "active");
		return "user-form/user-view";
	}
}
