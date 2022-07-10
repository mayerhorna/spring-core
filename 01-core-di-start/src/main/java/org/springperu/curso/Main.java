package org.springperu.curso;

import org.springperu.curso.controller.CustomerController;
import org.springperu.curso.model.Customer;

public class Main {
	public static void main(String[] args) {
		String nombre = "Jamil Silva";
		CustomerController customerController = new CustomerController();
		Customer customer = new Customer();
		customer.setName(nombre);
		customerController.saveCustomer(customer);
		System.out.println("Grabo OK!");
	}
}
