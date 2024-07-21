package com.rustam.account.service;

import com.rustam.account.exception.CustomerNotFoundException;
import com.rustam.account.model.Customer;
import com.rustam.account.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    protected Customer findCustomerById(Long id){
        return customerRepository.findById(id)
                .orElseThrow(() -> new CustomerNotFoundException
                        ("customer could not find by id : " + id));
    }
}
