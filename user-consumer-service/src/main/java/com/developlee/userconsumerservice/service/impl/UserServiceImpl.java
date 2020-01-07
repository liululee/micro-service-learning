package com.developlee.userconsumerservice.service.impl;

import com.developlee.userconsumerservice.domain.User;
import com.developlee.userconsumerservice.repository.UserRepository;
import com.developlee.userconsumerservice.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author liululee
 * @desc
 * @since 2019/5/13 0013
 *
 *
 **/
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    /**
     * id 查询 user
     *
     * @param id
     * @return
     */
    @Override
    public User findUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }
}
