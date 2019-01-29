package com.perry14.spring.boot.tutorial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.perry14.spring.boot.tutorial.vo.UserVO;

@RestController
public class MediaTypeController {

  /**
   * 根据客户端请求的 Content-Type，响应相应的 UserVO 类型.
   * 
   * @return
   */
  @RequestMapping("/user")
  public UserVO getUser() {
    return new UserVO("perry14", 30);
  }
}
