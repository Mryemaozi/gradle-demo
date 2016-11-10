package com.yeting.service.app;

import com.yeting.model.User;
import com.yeting.service.IUserService;
import com.yeting.service.impl.UserServiceImpl;
import org.apache.log4j.Logger;

/**
 * Created by Administrator on 2016/11/10.
 */
public class Application {
    private static final Logger LOGGER = Logger.getLogger(Application.class);
    public static void main(String[] args) {
        LOGGER.info("START : ");
        IUserService uservice = new UserServiceImpl();
        User user = uservice.get();
        LOGGER.info("USER : " + user);
        LOGGER.info("END : ");
    }
}
