package com.developlee.userconsumerservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liululee
 * @desc
 * @since 2019/5/20 0020
 **/
@Slf4j
@RestController
@RequestMapping("/load")
public class LoadController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    /**
     * 验证ribbon负载均衡
     */
    @GetMapping("ticket/load/info")
    public void loadTicket() {
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("ticket-provider-service");
        log.info("{}:{}:{}", serviceInstance.getServiceId(), serviceInstance.getHost(), serviceInstance.getPort());
    }
}
