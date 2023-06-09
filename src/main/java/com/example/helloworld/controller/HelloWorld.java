package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Fiee
 * @ClassName: HelloWorld
 * @Date: 2023/6/9
 * @Version: v1.0.0
 **/
@RestController
public class HelloWorld {
    @RequestMapping("/")
    public String hello(){
        return "Hello World";
    }
}
