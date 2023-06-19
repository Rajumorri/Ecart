package com.spring.JPA.service;

import com.spring.JPA.dao.RoleDao;
import com.spring.JPA.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private RoleDao roleDao;
    public Role create(Role role){
        return roleDao.save(role);
    }
}
