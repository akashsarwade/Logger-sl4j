package com.logger.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	Logger log=LoggerFactory.getLogger(MessageController.class);
	
	@GetMapping("/message")
	public String getMessage() {
		log.info("log information will get");
		log.warn("this is warn log");
		log.error("this is error log");
		log.debug("this is  debug log");
		log.trace("this is tracer log method");
		
		

		return "Logger Method message will display";
	}
	
	@GetMapping("/test/{name}")
	public String greeting(@PathVariable String name) {
		log.debug("Request {}",name);
		String responce="Hi "+name+" welcome to jave sl4j lib";
		log.debug("Responce {}",responce);
		return responce;
	}
}

//
//
//echo "# Logger-sl4j" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/akashsarwade/Logger-sl4j.git
//git push -u origin main
//
//
//
//
//
//…or push an existing repository from the command line
//git remote add origin https://github.com/akashsarwade/Logger-sl4j.git
//git branch -M main
//git push -u origin main
//

