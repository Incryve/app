package com.filmrental.app.service;

import com.filmrental.app.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer findById(Long id);
    Customer create(Customer customerToCreate);
    Customer update(Long id, Customer customer);
    void delete(Long id);
    List<Customer> findAll();
}
