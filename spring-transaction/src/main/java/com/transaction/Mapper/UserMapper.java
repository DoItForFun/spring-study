package com.transaction.Mapper;

import com.transaction.DAO.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(int id);
}
