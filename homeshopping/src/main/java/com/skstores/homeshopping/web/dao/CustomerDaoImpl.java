package com.skstores.homeshopping.web.dao;

import java.util.List;

import com.skstores.homeshopping.web.model.Customer;

public class CustomerDaoImpl implements CustomerDao {
	
	static List <Customer> customersList;
	
	@Override
	public List<Customer> getAllCustomers() {
		
		return customersList;
	}

	@Override
	public void addCustomer(Customer customer) {
		 customersList.add(customer);

	}

	@Override
	public void deleteCustomer(long customerId) {
		for( Customer customer :customersList)
		{
			if(customer.getId()==customerId) {
				customersList.remove(customer);
			}
		}

	}

	@Override
	public void updateCustomer(Customer customer) {
		for( Customer item :customersList)
		{
			if(item.getId()==customer.getId()) {
				customersList.remove(item);
				customersList.add(customer);
			}
		}
		
	}


}
