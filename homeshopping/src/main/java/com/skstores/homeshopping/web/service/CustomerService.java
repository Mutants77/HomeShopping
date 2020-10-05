package com.skstores.homeshopping.web.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.skstores.homeshopping.web.dao.CustomerDao;
import com.skstores.homeshopping.web.model.Customer;

public class CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	public void addCustomer(Customer customer) {
		
		customerDao.addCustomer(customer);
	}
	public void deleteCustomer(long customerId) {
		customerDao.deleteCustomer(customerId);
	}
	public void updateCustomer(Customer customer) {
		customerDao.updateCustomer(customer);
	}
}
