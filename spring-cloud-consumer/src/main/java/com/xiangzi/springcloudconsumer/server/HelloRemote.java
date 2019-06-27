package com.xiangzi.springcloudconsumer.server;


import com.xiangzi.springcloudconsumer.server.impl.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "spring-cloud-producer",fallback = HelloRemoteHystrix.class)  //这里的name必须是提供者的名称,也就是在application.yml设置的名称
public interface HelloRemote {

    @RequestMapping("/hello")  //必须和提供者的请求路径保持一致
    String hello(@RequestParam(value = "name") String name);
}
