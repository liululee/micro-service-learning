package com.developlee.userconsumerservice.repository;

import com.developlee.userconsumerservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author liululee
 * @desc
 * @since 2019/5/13 0013
 **/
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
