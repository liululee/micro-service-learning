package com.developlee.userconsumerservice.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author liululee
 * @desc
 * @since 2019/5/13 0013
 **/
@Data
@Entity
@Table(name = "tb_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private int age;

    @Column
    private boolean sex;

    @Column
    private String address;

    @Column
    private Date createTime;

}
