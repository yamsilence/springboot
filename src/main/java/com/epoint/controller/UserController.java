package com.epoint.controller;

import com.epoint.dao.UserMapper;
import com.epoint.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;
    @GetMapping("/getUser")
    public List<User> getUser(){
        return userMapper.getUser();
    }
    @GetMapping("/getUserByid/{id}")
    public User getUserByid(@PathVariable("id") Integer id){
        return userMapper.getUserByid(id);
    }
}
