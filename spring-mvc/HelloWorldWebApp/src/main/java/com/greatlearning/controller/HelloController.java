package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // stereotype annotation of @Component
public class HelloController {
	
	//adding the request mapping -->URL
	@RequestMapping("/")
	public String giveWelcomeMessage() {
		return "welcome"; // view file jsp file
	}
	
	//adding the request mapping -->URL
		@RequestMapping("/hello")
		public String giveHelloMessage() {
			return "hello";
		}
		
		//adding the request mapping -->URL
		@RequestMapping("/goodbye")
		public String giveGoodbyeMessage() {
			return "goodbye";
		}

}
