package com.xiangzi.springcloudconsulproducer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello,consul";
    }

    @GetMapping("/health")
    public String health() {
        return "hello health";
    }
}
