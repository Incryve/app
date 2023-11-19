package com.filmrental.app.service;

import com.filmrental.app.model.Customer;

public interface CustomerService {

    Customer findById(Long id);
    Customer create(Customer customerToCreate);
}
