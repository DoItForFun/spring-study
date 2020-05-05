package com.aop.service;

public class UserServiceImpl implements UserService {

    public String add() {
        return "添加";
    }

    public void delete() {
        System.out.println("删除");
    }

    public void update() {
        System.out.println("修改");
    }

    public void select() {
        System.out.println("查询");
    }
}
