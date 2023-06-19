package com.spring.JPA.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String name;
    private String lastName;
    private String firstName;
    private String userPassword;
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name = "USER-ROLE",
            joinColumns = {@JoinColumn(name = "User_Id")},
            inverseJoinColumns = {@JoinColumn(name = "Role_Id")}
    )
    private Set<Role> roles;
}
