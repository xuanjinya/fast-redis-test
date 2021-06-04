package com.example.fastredistest.controller;

import com.example.fastredistest.Service.UserService;
import com.example.fastredistest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/test")
    public User test() {
        return userService.queryUser();
    }
}
