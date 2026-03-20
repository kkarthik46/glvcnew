package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	@RequestMapping("/test")
	@ResponseBody
	public String message() {
		return "Example of docker run on spring ";
	}
	
}

