package com.epoint.controller;

import com.epoint.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testBoot")
public class UserController {
    @Autowired
    UserService userServiceImpl;
    @RequestMapping("getUser/{id}")
    public String getUser(@PathVariable int id){
        return userServiceImpl.sel(id).toString();
    }
}
