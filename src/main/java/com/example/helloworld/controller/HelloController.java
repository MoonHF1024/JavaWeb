package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    实际上访问的是http://localhost:8080/hello
//    在application.properties中配置port为80后，可省略端口号
    @GetMapping("/hello") //表示浏览器要发送get请求访问hello()方法
    public String hello(){
        return "你好";
    }
}
