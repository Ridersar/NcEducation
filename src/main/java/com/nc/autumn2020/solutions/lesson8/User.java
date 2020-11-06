package com.nc.autumn2020.solutions.lesson8;

import java.util.Arrays;

public class User {
    private String username;
    private String password;
    private int id;
    private Role[] roles;

    public User() {
    }

    public User(String username, String password, int id, Role[] roles) {
        this.username = username;
        this.password = password;
        this.id = id;
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Role[] getRoles() {
        return roles;
    }

    public void setRoles(Role[] roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                ", roles=" + Arrays.toString(roles) +
                '}';
    }
}
