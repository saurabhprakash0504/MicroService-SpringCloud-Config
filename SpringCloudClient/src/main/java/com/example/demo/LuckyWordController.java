package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@ConfigurationProperties for the cloud-bus
@ConfigurationProperties(prefix = "country")
public class LuckyWordController {
	
	//values for the cloud- config	
	//@Value("${Capital}")
	String capital;

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	@GetMapping("/capitalCountry")
	public String showLuckyWord() {
		return "The capital of country is: " + capital;
	}
}