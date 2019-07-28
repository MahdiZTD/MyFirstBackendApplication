package com.tahghighdoost.my_first_application.Services;

import com.tahghighdoost.my_first_application.domain.Customer;

import java.util.List;

public interface CustomerService {

    Customer findCustomerById(Long id);

    List<Customer> findAllCustomers();

    Customer saveCustomer(Customer customer);
}
