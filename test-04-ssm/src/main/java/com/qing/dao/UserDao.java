package com.qing.dao;

import com.qing.domain.User;

import java.util.List;

/**
 * @author 卿
 * @create 2020-12-23 9:56
 */
public interface UserDao {
    /**
     * 查询所有用户信息
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
