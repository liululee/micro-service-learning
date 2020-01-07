package com.developlee.userconsumerservice.domain.pojo;

import lombok.Data;

/**
 * @author liululee
 * @desc
 * @since 2019/5/13 0013
 **/
@Data
public class Ticket {
    private Long id;

    private String ticketName;

    private String expireTime;

    private int status;

    private Long userId;
}
