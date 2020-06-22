package com.github.sejoung.ddd.chapter1.dao;

import com.github.sejoung.ddd.chapter1.dto.Customer;

public interface CustomerDao {

    Customer readCustomer(String customerId);

}
