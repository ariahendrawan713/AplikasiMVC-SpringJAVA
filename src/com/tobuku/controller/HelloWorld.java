package com.tobuku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {
	@RequestMapping("/hello")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>&lt;&lt;&lt; Ola, welcome to the Spring MVC World &gt;&gt;&gt;" 
				+ "</h3><p>This message comes from <b>HelloWorld.java</b></div>";
		return new ModelAndView("welcome", "message", message); 
		//Open the welcome.jsp and pass the message
	}
}
