package com.epoint.controller;


import com.epoint.entity.User;
import com.epoint.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userServiceImpl;
    @RequestMapping("/getUser")
    public List<User> getUser(){
        return userServiceImpl.getUser();
    }
}
