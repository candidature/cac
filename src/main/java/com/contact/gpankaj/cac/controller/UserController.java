package com.contact.gpankaj.cac.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.contact.gpankaj.cac.model.User;
import com.contact.gpankaj.cac.service.UserService;
import com.contact.gpankaj.cac.service.UserServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;

	@GetMapping(value="/register")
	public ModelAndView userRegisterGet() {
		ModelAndView modelAndView = new ModelAndView();
		User user = new User();
		modelAndView.setViewName("register.html");
		modelAndView.addObject("user", user);
		return modelAndView;
		
	}
	
	@PostMapping(value="/register")
	public ModelAndView userRegisterPost(@Valid User user, BindingResult bindingResult, ModelMap mpdelmap) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home.html");
		userService.saveUser(user);
		return modelAndView;
		
	}
	
}
