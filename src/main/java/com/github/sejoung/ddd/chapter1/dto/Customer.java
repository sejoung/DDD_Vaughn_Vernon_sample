package com.github.sejoung.ddd.chapter1.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Customer {

    private String customerId;

    private String customerFirstName;

    private String customerLastName;

    private String streetAddress1;

    private String streetAddress2;

    private String city;

    private String stateOrProvince;

    private String postalCode;

    private String country;

    private String homePhone;

    private String mobilePhone;

    private String primaryEmailAddress;

    private String secondaryEmailAddress;

}
