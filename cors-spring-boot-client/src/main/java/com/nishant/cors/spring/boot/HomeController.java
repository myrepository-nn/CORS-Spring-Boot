package com.nishant.cors.spring.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping(value="/show",method=RequestMethod.GET)
	public String home() {
		System.out.println("in show");
		return "view";
	}
	
	@RequestMapping(value="/capture",method=RequestMethod.POST)
	public String captureData(@RequestBody String data) {
		System.out.println("data received: "+data);
		return data;
	}

}
