package com.turkcell.Abstract;

import com.turkcell.entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{


    public  void Save(Customer customer) {
        System.out.println("Saved to db :"+customer.getFirstName());
    }
}
