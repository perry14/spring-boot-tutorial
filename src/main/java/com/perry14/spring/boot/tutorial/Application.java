package com.perry14.spring.boot.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableScheduling
@EnableAsync
public class Application {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    SpringApplication.run(Application.class, args);
  }
}
