package com.qfedu.demo.service.impl;

import com.qfedu.demo.dao.UserDao;
import com.qfedu.demo.service.UserService;

public class UserServiceNormal implements UserService {
    private UserDao userDao;

    public UserServiceNormal() {
        super();
    }

    public UserServiceNormal(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }



    public void add() {
        userDao.add();
    }
}
