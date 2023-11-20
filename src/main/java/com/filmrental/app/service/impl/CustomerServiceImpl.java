package com.filmrental.app.service.impl;

import com.filmrental.app.model.Customer;
import com.filmrental.app.repository.CustomerRepository;
import com.filmrental.app.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
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
            throw new IllegalArgumentException("Customer ID already exists");
        }
        return customerRepository.save(customerToCreate);
    }

    @Override
    public Customer update(Long id, Customer customer) {
        Customer existingCustomer = customerRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Customer not found with id: " + id));

        existingCustomer.setFirstName(customer.getFirstName());
        existingCustomer.setLastName(customer.getLastName());
        existingCustomer.setEmail(customer.getEmail());
        existingCustomer.setPhone(customer.getPhone());
        return customerRepository.save(existingCustomer);
    }

    @Override
    public void delete(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}