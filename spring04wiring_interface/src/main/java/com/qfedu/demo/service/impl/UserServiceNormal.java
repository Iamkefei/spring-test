package com.qfedu.demo.service.impl;

import com.qfedu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserServiceNormal implements UserService {
    public void add() {
        System.out.println("添加用户");
    }
}
