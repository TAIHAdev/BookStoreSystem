package service;

import dataSource.Database;

public class CustomerService {
    public static Customer getCustomerById(int id) {
        for (var customer : Database.customers) {
            if (customer.id() == id) return customer;
        }
        return null;
    }
}
