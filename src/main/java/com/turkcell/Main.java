package com.turkcell;

import com.turkcell.Abstract.BaseCustomerManager;
import com.turkcell.concrete.CustomerCheckManager;
import com.turkcell.concrete.NeroCustomerManager;
import com.turkcell.concrete.StarbucksCustomerManage;
import com.turkcell.entities.Customer;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setId(1);
        customer.setFirstName("Rozerin");
        customer.setLastName("Güneş");
        customer.setDateOfBirth(new Date(1958, 5, 21));
        customer.setNationalityId("12345678996");

        BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManage(new CustomerCheckManager());
        BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
        starbucksCustomerManager.Save(customer);
        neroCustomerManager.Save(customer);

    }
}