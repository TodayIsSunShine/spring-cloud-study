package com.xiangzi.springcloudproducer.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//
//    @RequestMapping("/hello")
//    public String hello(@RequestParam String name) {
//        return "hello," + name + " this is first message";
//    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello world!";
    }

    @RequestMapping("/foo")
    public String foo(String foo) {
        return "hello," + foo + "!";
    }
}
