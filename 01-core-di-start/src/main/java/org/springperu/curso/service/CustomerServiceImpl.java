package org.springperu.curso.service;

import org.springperu.curso.dao.CustomerDaoJdbc;
import org.springperu.curso.model.Customer;

public class CustomerServiceImpl {
	CustomerDaoJdbc customerDao = new CustomerDaoJdbc();
	public void saveCustomer(Customer customer) {
		CustomerDaoJdbc customerDao = new CustomerDaoJdbc();
		customerDao.saveCustomer(customer);
	}
	
	public Customer getCustomer(Long id) {
		return customerDao.getCustomer(id);
	}
	
}
