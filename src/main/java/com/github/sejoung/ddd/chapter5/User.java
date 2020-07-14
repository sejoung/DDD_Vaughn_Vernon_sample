package com.github.sejoung.ddd.chapter5;

import org.springframework.util.StringUtils;

public class User {

    private String password;


    private String tenantId;

    public User(String password, String tenantId) {
        this.setPassword(password);
        this.setTenantId(tenantId);
    }

    private void setPassword(String password) {
        if (StringUtils.isEmpty(password)) {
            throw new IllegalArgumentException("password는 필수 값입니다.");
        }

        this.password = password;
    }

    private void setTenantId(String tenantId) {
        if (StringUtils.isEmpty(tenantId)) {
            throw new IllegalArgumentException("tenantId는 필수 값입니다.");
        }
        this.tenantId = tenantId;
    }
}
