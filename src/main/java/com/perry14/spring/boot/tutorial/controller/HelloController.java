package com.perry14.spring.boot.tutorial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @RequestMapping("/hello")
  public String hello() {
    return "Hello World! This is a spring boot demo!";
  }
}
