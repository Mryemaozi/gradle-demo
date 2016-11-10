package com.yeting.controller;

import com.yeting.model.User;
import com.yeting.service.IUserService;
import com.yeting.service.impl.UserServiceImpl;
import org.apache.log4j.Logger;

/**
 * Created by Administrator on 2016/11/9.
 */
public class UserController {
    private IUserService uservice = new UserServiceImpl();
    private static final Logger LOGGER = Logger.getLogger(UserController.class);
    public User get(){
        LOGGER.info("log4j...start...");
        System.out.println("HelloWorld");
        User user = uservice.get();
        LOGGER.info("user : " + user);
        LOGGER.info("log4j...end...");
        return user;
    }
}
