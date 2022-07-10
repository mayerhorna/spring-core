package org.springperu.curso.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.springperu.curso.controller.CustomerController;
import org.springperu.curso.model.Customer;

public class CustomerFrame extends JFrame{
	
	private JLabel nombreLabel = new JLabel("Nombre:");
	private JTextField nombreTextfield = new JTextField();
	private JButton grabarButton = new JButton("Grabar");
	
	public CustomerFrame() {
		super("Nuevo Cliente");
		JPanel listPane = new JPanel();
		listPane.setLayout(new BoxLayout(listPane,BoxLayout.PAGE_AXIS));
		listPane.add(nombreLabel);
		listPane.add(nombreTextfield);
		listPane.add(grabarButton);
		this.add(listPane);
		listPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.setSize(300, 120);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		grabarButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveCustomer();
			}
		});
		
	}
	
	public void showFrame() {
		this.setVisible(true);
	}
	
	private void saveCustomer() {
		String nombre = "Jamil Silva";
		CustomerController customerController = new CustomerController();
		Customer customer = new Customer();
		customer.setName(nombre);
		try {
			customerController.saveCustomer(customer);
			JOptionPane.showMessageDialog(null, "Grabó satisfactoriamente","OK", JOptionPane.INFORMATION_MESSAGE);
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null,ex.getMessage() ,"Error", JOptionPane.WARNING_MESSAGE );
		}
	}
}
