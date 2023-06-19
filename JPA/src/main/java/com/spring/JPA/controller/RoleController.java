package com.spring.JPA.controller;

import com.spring.JPA.entity.Role;
import com.spring.JPA.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
    @Autowired
    private RoleService roleService;
    @PostMapping("/createNewRole")
    public Role createRole(@RequestBody Role role){
        return roleService.create(role);
    }

}
