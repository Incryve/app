package com.filmrental.app.service.impl;

import com.filmrental.app.model.Customer;
import com.filmrental.app.repository.CustomerRepository;
import com.filmrental.app.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Customer create(Customer customerToCreate) {
        if (customerRepository.existsById(customerToCreate.getId())) {
            throw new IllegalArgumentException("User ID already exists");
        }
        return customerRepository.save(customerToCreate);
    }
}
