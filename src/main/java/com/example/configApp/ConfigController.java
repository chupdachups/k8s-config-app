package com.example.configApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
	
	@Value("${config.message}")
	String configMessage;
	
	@RequestMapping(value = "/config", method = RequestMethod.GET)
	public String getMessage() {
		return "Welcome MSA CLASS!" + " " + configMessage+"\n";
	}
}
