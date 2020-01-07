package com.developlee.userconsumerservice.controller;

import com.developlee.userconsumerservice.domain.User;
import com.developlee.userconsumerservice.domain.pojo.Ticket;
import com.developlee.userconsumerservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liululee
 * @desc
 * @since 2019/5/13 0013
 **/
@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {

    @Resource
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/{id}")
    public Ticket findTicketByUser(@PathVariable Long id){
        // 根据userId查询票据
       return this.restTemplate.getForObject("http://localpeer1:8001/tickets/" + id, Ticket.class);
    }

    /**
     * 验证eureka元数据
     * @return
     */
    @GetMapping("/ticket/instance")
    public List<ServiceInstance> showServicesInfo() {
        return this.discoveryClient.getInstances("ticket-provider-service");
    }



}
