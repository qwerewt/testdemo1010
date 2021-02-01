package com.example.demo12.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @Auther:http://www.bjsxt.com
 * @Date: 2021/1/28
 * @Description: com.example.demo12.controller
 * @Version: 1.0
 */
@RestController
@CrossOrigin
public class w1 {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
