package com.developlee.userconsumerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UserConsumerServiceApplication {

    @Bean
    @LoadBalanced // 使用Ribbon LoadBalanced负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(UserConsumerServiceApplication.class, args);
    }

}
