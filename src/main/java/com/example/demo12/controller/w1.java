package com.example.demo12.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2021/1/28
 * @Description: com.example.demo12.controller
 * @Version: 1.0
 */
@RestController
@RequestMapping("/hello")
public class w1 {
    @GetMapping("/world")
    public String hello(){
        return "hello";
    }
}
