package com.mybatis.mapper;

import com.mybatis.dao.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class User2MapperImpl extends SqlSessionDaoSupport implements UserMapper {
    public List <User> getUser() {
        SqlSession sqlSession = getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        return userMapper.getUser();
    }
}
