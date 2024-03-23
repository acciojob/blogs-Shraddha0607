package com.driver.models;

import javax.persistence.*;

@Entity
public class User{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer userId;
    @Column(nullable=true)
    private String name;
    @Column(nullable=true)
    private String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}