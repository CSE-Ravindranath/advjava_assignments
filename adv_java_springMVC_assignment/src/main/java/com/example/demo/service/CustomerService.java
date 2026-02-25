package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public void saveCustomer(Customer customer) {
        repository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }
}
