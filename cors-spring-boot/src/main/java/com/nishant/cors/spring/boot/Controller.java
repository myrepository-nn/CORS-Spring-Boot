package com.nishant.cors.spring.boot;

import java.util.Date;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class Controller {
	
	@CrossOrigin(origins="http://localhost:8081")
	@RequestMapping(value="/get/{name}",method=RequestMethod.GET)
	public String getMethod(@PathVariable String name) {
		System.out.println("server");
		return name+new Date().getSeconds();
	}

}
