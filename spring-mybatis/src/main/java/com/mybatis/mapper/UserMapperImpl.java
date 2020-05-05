package com.mybatis.mapper;

import com.mybatis.dao.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class UserMapperImpl implements UserMapper {
    private SqlSessionTemplate sqlSession;
    public void setSqlSession(SqlSessionTemplate sqlSession){
        this.sqlSession = sqlSession;
    }
    public List <User> getUser() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        return userMapper.getUser();
    }
}


