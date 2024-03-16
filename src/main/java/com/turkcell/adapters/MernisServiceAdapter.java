package com.turkcell.adapters;

import com.turkcell.Abstract.ICustomerCheckService;
import com.turkcell.entities.Customer;

public class MernisServiceAdapter implements ICustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return false;
    }
}
