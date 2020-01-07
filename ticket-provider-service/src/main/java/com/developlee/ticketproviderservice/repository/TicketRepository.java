package com.developlee.ticketproviderservice.repository;

import com.developlee.ticketproviderservice.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author liululee
 * @desc
 * @since 2019/5/13 0013
 **/
@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    Ticket findTicketByUserId(Long userId);
}
