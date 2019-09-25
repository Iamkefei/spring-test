package com.qfedu.demo.config;

import com.qfedu.demo.dao.UserDao;
import com.qfedu.demo.dao.impl.UserDaoNormal;
import com.qfedu.demo.service.UserService;
import com.qfedu.demo.service.impl.UserServiceNormal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UserDao userDaoNormal() {
        System.out.println("创建UserDao对象");
        return new UserDaoNormal();
    }

    @Bean
    public UserService userServiceNormal(UserDao userDao) {
        System.out.println("创建UserService对象");
//        return new UserServiceNormal(userDao);
        UserServiceNormal userService = new UserServiceNormal();
        userService.setUserDao(userDao);
        return userService;
    }
}
