package com.xiangzi.springcloudconsumer.server.impl;

import com.xiangzi.springcloudconsumer.server.HelloRemote;
import org.springframework.stereotype.Component;

@Component
public class HelloRemoteHystrix implements HelloRemote {
    //如果服务异常,则返回如下信息
    @Override
    public String hello(String name) {
        return "hello " + name + ",this message send failed";
    }
}
