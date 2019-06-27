package com.xiangzi.springcloudproducer1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello smile!";
    }


    @RequestMapping("/foo")
    public String foo(String foo) {
        return "hello," + foo + "!!";
    }
}
