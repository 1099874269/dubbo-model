package com.impl;

import com.api.UserDaoApi;
import com.entity.User;
import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserDao implements UserDaoApi<User> {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> selUser() {
        return userMapper.selectList(null);
    }
}
