package com.mmall.service.impl;

import com.mmall.dao.UserMapper;
import com.mmall.pojo.User;
import com.mmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(Integer id) {
        System.out.println("service ........");
        return userMapper.findUserById(id);
    }
}
