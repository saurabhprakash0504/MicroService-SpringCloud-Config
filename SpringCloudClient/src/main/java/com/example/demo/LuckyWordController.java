package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LuckyWordController {

  @Value("${Capital}") String capital;

  @GetMapping("/capitalCountry")
  public String showLuckyWord() {
    return "The capital of country is: "+ capital;
  }
}