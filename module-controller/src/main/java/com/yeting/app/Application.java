package com.yeting.app;

import com.yeting.controller.UserController;
import com.yeting.model.User;

/**
 * Created by Administrator on 2016/11/9.
 */
public class Application {

    public static void main(String[] args) {
        UserController userController = new UserController();
        User user = userController.get();
        System.out.println(user);
    }
}
