package com.turkcell.concrete;

import com.turkcell.Abstract.BaseCustomerManager;
import com.turkcell.Abstract.ICustomerCheckService;
import com.turkcell.Abstract.ICustomerService;
import com.turkcell.entities.Customer;
import jdk.jshell.spi.ExecutionControl;

public class StarbucksCustomerManage extends BaseCustomerManager {
    private ICustomerCheckService customerCheckServiceService;

    public StarbucksCustomerManage(ICustomerCheckService customerCheckService) {
        customerCheckService = customerCheckService;

    }

    public void Save(Customer customer) {
        if (customerCheckServiceService.checkIfRealPerson(customer)) {
            super.Save(customer);
        } else
        {
            throw new RuntimeException("Not a valid person");
        }
    }

    @Override
    public void save(Customer customer) {

    }
}
