package com.djain.elk.controller;

import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/elk")
public class Controller {
	
	private static final Logger log = LoggerFactory.getLogger(Controller.class);
	
	@GetMapping(value = "/hello")
	public String helloWorld() {
		log.info("hello controller called...");
		String response = "Hello World! " + new Date();
		log.info("Data is => {}", response);
		
		return response;
	}
}
