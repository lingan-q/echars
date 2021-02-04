package com.qing.service;

import com.qing.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 卿
 * @create 2020-12-23 9:57
 */
@Service
public interface UserService {
    /**
     * 查询所有用户
     * @return
     */
    List<User> queryAll();

    /**
     * 查询用户是否存在
     * @param user
     * @return
     */
    User queryUser(User user);
}
