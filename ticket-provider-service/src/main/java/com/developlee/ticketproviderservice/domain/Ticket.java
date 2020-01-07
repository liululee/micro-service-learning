package com.developlee.ticketproviderservice.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author liululee
 * @desc
 * @since 2019/5/13 0013
 **/
@Entity
@Data
@Table(name = "tb_ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // 票据名称
    @Column
    private String ticketName;

    // 截止有效期
    @Column
    private Date expireTime;

    // 票据状态 0 未使用 1已使用 2 已过期
    @Column
    private int status;

    // 用户Id
    @Column
    private Long userId;
}
