package com.transaction.Mapper;

import com.transaction.DAO.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{

    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public List <User> getUserList() {
        UserMapper userMapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return userMapper.getUserList();
    }

    public int addUser(User user) {
        UserMapper userMapper = sqlSessionTemplate.getMapper(UserMapper.class);
        this.deleteUser(6);
        return userMapper.addUser(user);
    }

    public int updateUser(User user) {
        UserMapper userMapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return userMapper.updateUser(user);
    }

    public int deleteUser(int id) {
        UserMapper userMapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return userMapper.deleteUser(id);
    }

}
