package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix = "eat")
public class FruitsController {

	//@Value("${Fruits}")
	String Fruits;

	/*public String getFruits() {
		return fruits;
	}

	public void setFruits(String fruits) {
		this.fruits = fruits;
	}*/

	@GetMapping("/countryFruit")
	public String showLuckyWord() {
		return "The fruit of country is >> : " + Fruits;
	}

	public String getFruits() {
		return Fruits;
	}

	public void setFruits(String Fruits) {
		this.Fruits = Fruits;
	}
}