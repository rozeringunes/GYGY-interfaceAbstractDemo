package com.turkcell.Abstract;

import com.turkcell.entities.Customer;

public interface ICustomerCheckService {
    boolean checkIfRealPerson(Customer customer);
    }

