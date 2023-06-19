package com.spring.JPA.dao;

import com.spring.JPA.entity.Role;
import org.springframework.context.support.BeanDefinitionDsl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends JpaRepository<Role,String> {
}
