package com.epoint.service.impl;

import com.epoint.dao.UserMapper;
import com.epoint.entity.User;
import com.epoint.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> getUser() {
        return userMapper.getUser();
    }
}
