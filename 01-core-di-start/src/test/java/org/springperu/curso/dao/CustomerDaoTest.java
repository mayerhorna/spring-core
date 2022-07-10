package org.springperu.curso.dao;

import junit.framework.TestCase;

import org.springperu.curso.model.Customer;

public class CustomerDaoTest extends TestCase {
	CustomerDaoJdbc customerDao;
	protected void setUp() throws Exception {
		super.setUp();
		customerDao = new CustomerDaoJdbc();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testSaveCustomer() {
		Customer c = new Customer();
		c.setName("J PEREZ 7");
		customerDao.saveCustomer(c);
		assertNotNull("No genero id, corrige tu código",c.getId());	
	}

	public void testGetCustomer() {
		//fail("Not yet implemented");
	}
}
