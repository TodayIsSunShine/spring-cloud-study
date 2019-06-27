package com.xiangzi.gatewayservicezuul;

import com.xiangzi.gatewayservicezuul.filter.TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy //支持网关路由
public class GatewayServiceZuulApplication {

    @Bean
    public TokenFilter tokenFilter() {
        return new TokenFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceZuulApplication.class, args);
    }

}
