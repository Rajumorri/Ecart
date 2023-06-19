package com.spring.JPA.service;

import com.spring.JPA.dao.UserDao;
import com.spring.JPA.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public User registerUser(User user){
        return  userDao.save(user);
    }
}
