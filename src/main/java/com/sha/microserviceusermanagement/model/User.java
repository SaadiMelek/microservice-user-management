package com.sha.microserviceusermanagement.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "user")
@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String username;
    private String password;


    @Enumerated(value = EnumType.STRING)
    @Column(name = "role")
    private Role role;
}
