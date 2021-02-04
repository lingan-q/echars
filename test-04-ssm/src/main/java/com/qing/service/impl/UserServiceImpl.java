package com.qing.service.impl;

import com.qing.dao.UserDao;
import com.qing.domain.User;
import com.qing.service.UserService;

import java.util.List;

/**
 * @author 卿
 * @create 2020-12-23 16:04
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Override
    public List<User> queryAll() {
        return userDao.queryAll();
    }

    @Override
    public User queryUser(User user) {
        return userDao.queryUser(user);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
