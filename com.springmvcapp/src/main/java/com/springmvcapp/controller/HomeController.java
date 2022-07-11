package com.springmvcapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
  //this class will have controller method
	
	// order---->waiter------>kitchen
	//request---->controller----->
	
	@RequestMapping("/welcome")
	public String processWelcomeRequest() {
		System.out.println("hitting controller----------");
		return "welcome";
	}
}
