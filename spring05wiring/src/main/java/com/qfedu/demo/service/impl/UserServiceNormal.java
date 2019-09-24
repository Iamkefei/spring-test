package com.qfedu.demo.service.impl;

import com.qfedu.demo.dao.UserDao;
import com.qfedu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceNormal implements UserService {
    @Autowired
    private UserDao userDao;

    public void add() {
        System.out.println("添加用户");
    }
}
