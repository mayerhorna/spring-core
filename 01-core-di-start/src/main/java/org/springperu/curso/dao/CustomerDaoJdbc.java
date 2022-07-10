package org.springperu.curso.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springperu.curso.model.Customer;

public class CustomerDaoJdbc {
	
	public void saveCustomer(Customer customer) {
		Connection conn = DBManager.getConnection();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement("INSERT INTO customer(name) VALUES(?)");
			ps.setString(1, customer.getName());
			int nr = ps.executeUpdate();
			if(nr!=1){
				throw new RuntimeException("No grabo el registro");
			}
			ps = conn.prepareStatement("SELECT MAX(id) FROM customer");
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				customer.setId(rs.getLong(1));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally{
			if(ps != null){
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null){
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
	}

	public Customer getCustomer(Long id) {
		return null;
	}
}
