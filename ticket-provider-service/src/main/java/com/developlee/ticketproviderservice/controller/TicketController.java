package com.developlee.ticketproviderservice.controller;

import com.developlee.ticketproviderservice.domain.Ticket;
import com.developlee.ticketproviderservice.service.TicketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author liululee
 * @desc
 * @since 2019/5/13 0013
 **/
@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Resource
    private TicketService ticketService;

    /**
     * id 查询ticket
     * @param id
     * @return
     */
    @GetMapping("/{userId}")
    public Ticket findTicket(@PathVariable("userId") Long userId) {
        // id 查询ticket
        Ticket ticket = ticketService.findTicketByUserId(userId);
        return ticket;
    }

}
