package com.github.sejoung.ddd.chapter5;

import org.springframework.util.StringUtils;

public class User extends Entity {

    private String userName;

    private String password;

    private String tenantId;

    protected User(String userName, String password, String tenantId) {
        this.setUserName(userName);
        this.setPassword(password);
        this.setTenantId(tenantId);

    }

    private void setUserName(String userName) {
        if (StringUtils.isEmpty(userName)) {
            throw new IllegalArgumentException("userName은 필수 값입니다.");
        }
        this.userName = userName;
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

    @Override
    public String toString() {
        return "User{" +
            "userName='" + userName + '\'' +
            ", password='" + password + '\'' +
            ", tenantId='" + tenantId + '\'' +
            '}';
    }
}
