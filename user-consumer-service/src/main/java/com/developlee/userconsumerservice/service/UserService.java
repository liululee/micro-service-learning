package com.developlee.userconsumerservice.service;

import com.developlee.userconsumerservice.domain.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;

/**
 * @author liululee
 * @desc
 * @since 2019/5/13 0013
 **/
@ConditionalOnMissingBean(UserService.class)
public interface UserService {
    /**
     * id 查询 user
     * @param id
     * @return
     */
    User findUserById(Long id);
}
