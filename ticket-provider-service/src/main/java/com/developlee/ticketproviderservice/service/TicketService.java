package com.developlee.ticketproviderservice.service;

import com.developlee.ticketproviderservice.domain.Ticket;
import com.developlee.ticketproviderservice.service.impl.TicketServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;

/**
 * @author liululee
 * @desc
 * @since 2019/5/13 0013
 **/
@ConditionalOnMissingBean(TicketServiceImpl.class)
public interface TicketService {
    Ticket findTicketByUserId(Long id);
}
