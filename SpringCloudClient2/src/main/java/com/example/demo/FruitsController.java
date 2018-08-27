package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FruitsController {

  @Value("${Fruits}") String fruits;

  @GetMapping("/countryFruit")
  public String showLuckyWord() {
    return "The fruit of country is: "+ fruits;
  }
}