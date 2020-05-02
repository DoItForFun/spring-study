package com.ioc.service;

import com.ioc.dao.UserDao;

public interface UserService {
    void getUser();

    void setUserDao(UserDao userDao);
}
