package com.skstores.homeshopping.web.dao;

import java.util.List;

import com.skstores.homeshopping.web.model.Customer;

public interface CustomerDao {
	 List <Customer> getAllCustomers();
	
	 void addCustomer(Customer customer);
	 void deleteCustomer(long customerId);
	 void updateCustomer(Customer customer);
}
