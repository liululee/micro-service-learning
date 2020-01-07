package com.developlee.ticketproviderservice.service.impl;

import com.developlee.ticketproviderservice.domain.Ticket;
import com.developlee.ticketproviderservice.repository.TicketRepository;
import com.developlee.ticketproviderservice.service.TicketService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author liululee
 * @desc
 * @since 2019/5/13 0013
 **/
@Service
public class TicketServiceImpl implements TicketService {

    @Resource
    private TicketRepository ticketRepository;

    @Override
    public Ticket findTicketByUserId(Long id) {
       Ticket ticket =  ticketRepository.findTicketByUserId(id);
       return ticket;
    }
}
