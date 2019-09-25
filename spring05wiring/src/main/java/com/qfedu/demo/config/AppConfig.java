package com.qfedu.demo.config;

import com.qfedu.demo.dao.UserDao;
import com.qfedu.demo.service.UserService;
import com.qfedu.demo.web.UserController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = {"com.qfedu.demo"})
@ComponentScan(basePackageClasses = {UserController.class, UserService.class, UserDao.class})
public class AppConfig {
}
