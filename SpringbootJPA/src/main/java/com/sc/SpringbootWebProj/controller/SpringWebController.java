package com.sc.SpringbootWebProj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringWebController {

	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome !!!";
	}
}
