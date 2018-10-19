package io.pivotal.data.sappho.reatailapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String helloWorld() {		
		return "Hello World !!";
	}

}
