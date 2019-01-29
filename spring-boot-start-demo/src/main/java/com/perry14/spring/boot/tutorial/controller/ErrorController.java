package com.perry14.spring.boot.tutorial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {

  @RequestMapping("/exception")
  public String hello() throws Exception {
    throw new Exception("发生错误");
  }
}
