package com.github.sejoung.ddd.chapter5;

public class Tenant extends Entity {

    public User registerUser(String userName, String password, String tenantId) {
        return new User(userName, password, tenantId);
    }
}
