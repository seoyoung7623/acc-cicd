package accc.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CicdController{
	
	@GetMapping("/hello")
	public String helloWorld(){
		return "안녕하세요.";
	}

}
