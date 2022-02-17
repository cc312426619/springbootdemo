package com.ydc.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @GetMapping("/hello")
    public String hello() {
        redisTemplate.opsForValue().set("key", "value");
        return "Hello World!";
    }
}
