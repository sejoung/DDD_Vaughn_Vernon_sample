package com.github.sejoung.ddd.chapter5;

import org.springframework.util.StringUtils;

public final class EmailAddress {

    private String address;

    public EmailAddress(String address) {
        this.setAddress(address);
    }

    private void setAddress(String address) {

        if (StringUtils.isEmpty(address)) {
            throw new IllegalArgumentException("address 값이 비었다.");
        }

        if (address.length() > 100) {
            throw new IllegalArgumentException("address 값이 100자를 초과하면 안된다.");
        }
        this.address = address;

    }
}
