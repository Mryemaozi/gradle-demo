package com.yeting.service.impl;

import com.yeting.model.User;
import com.yeting.service.IUserService;

/**
 * Created by Administrator on 2016/11/9.
 */
public class UserServiceImpl implements IUserService {

    @Override
    public User get() {
        User user = new User();
        user.setId(1L);
        user.setUserName("yeting");
        user.setAge(26);
        user.setAddress("shanghai");
        return user;
    }
}
