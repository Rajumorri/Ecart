package com.spring.JPA.controller;

import com.spring.JPA.entity.User;
import com.spring.JPA.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/newUser")
    public User registerUser(@RequestBody User user){
        return userService.registerUser(user);
    }
}
