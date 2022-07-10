package org.springperu.curso.controller;

import org.springperu.curso.model.Customer;
import org.springperu.curso.service.CustomerServiceImpl;

public class CustomerController {
	public void saveCustomer(Customer customer) {
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		customerService.saveCustomer(customer);
	}
	
	public Customer saveCustomer(Long id) {
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		return customerService.getCustomer(id);
	}
	
}


