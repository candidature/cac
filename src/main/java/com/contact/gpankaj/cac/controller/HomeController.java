package com.contact.gpankaj.cac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.contact.gpankaj.cac.service.UserService;
import com.contact.gpankaj.cac.service.UserServiceImpl;

@Controller
public class HomeController {

	@GetMapping(value="/home")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView();
		UserService userService = new UserServiceImpl();
		modelAndView.addObject("users", userService);
		modelAndView.setViewName("index.html");
		return modelAndView;
		
	}
	
}
