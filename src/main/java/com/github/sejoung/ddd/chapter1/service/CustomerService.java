package com.github.sejoung.ddd.chapter1.service;

import com.github.sejoung.ddd.chapter1.dao.CustomerDao;
import com.github.sejoung.ddd.chapter1.dto.Customer;
import java.util.Objects;
import javax.transaction.Transactional;

public class CustomerService {

    private CustomerDao customerDao;

    @Transactional
    public void saveCustomer(String customerId, String customerFirstName, String customerLastName,
        String streetAddress1, String streetAddress2, String city, String stateOrProvince,
        String postalCode, String country, String homePhone, String mobilePhone,
        String primaryEmailAddress, String secondaryEmailAddress) {

        Customer customer = customerDao.readCustomer(customerId);

        if (Objects.isNull(customer)) {
            customer = new Customer();
            customer.setCustomerId(customerId);
        }

        customer.setCustomerFirstName(customerFirstName);

        customer.setCustomerLastName(customerLastName);

        customer.setStreetAddress1(streetAddress1);
        customer.setStreetAddress2(streetAddress2);
        customer.setCity(city);
        customer.setStateOrProvince(stateOrProvince);
        customer.setPostalCode(postalCode);
        customer.setCountry(country);
        customer.setHomePhone(homePhone);
        customer.setMobilePhone(mobilePhone);
        customer.setPrimaryEmailAddress(primaryEmailAddress);
        customer.setSecondaryEmailAddress(secondaryEmailAddress);
    }

}
