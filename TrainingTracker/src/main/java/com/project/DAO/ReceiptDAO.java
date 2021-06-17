package com.project.DAO;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.project.model.ReceiptModel;

public class ReceiptDAO {
	
	private String jdbcURL = "jdbc:mysql://localhost:3306/employees?useTimezone=true&serverTimezone=UTC";
	private String jdbcUsername = "root";
	private String jdbcPassword = "root";
	
	private static final String SELECT_MY_TRAINING = "select * from receipt where username = ?";
	
	public ReceiptDAO() {
		
	}
	protected Connection getConnection() throws SQLException, ClassNotFoundException {
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager
					.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Connection connection = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
		return connection;
	}
	
	public void insertReceipt(ReceiptModel receipt) throws ClassNotFoundException {
		
		//int emp_id = getID(receipt.getUsername());
		
		try (Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO receipt" + "  (username, coursename) VALUES "
						+ " (?, ?);")) {
				preparedStatement.setString(1, receipt.getUsername());
				preparedStatement.setString(2, receipt.getCourseName());
				System.out.println(preparedStatement);
				preparedStatement.executeUpdate();
			} catch (SQLException e) {
				
			}
		
	}
	public List<ReceiptModel> MyTraining(String usernamee) throws ClassNotFoundException {
		List<ReceiptModel> mine = new ArrayList<>();
		try (Connection connection = getConnection();

 				// Step 2:Create a statement using connection object
 			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_MY_TRAINING);) {
			preparedStatement.setString(1, usernamee);
			System.out.println(preparedStatement);
 			ResultSet rs = preparedStatement.executeQuery();

 			while (rs.next()) {
 				int receipt_id = rs.getInt("receipt_id");
 				String username = rs.getString("username");
 				String coursename = rs.getString("coursename");
 				
 				mine.add(new ReceiptModel (receipt_id, username, coursename));
 			}
 		} catch (SQLException e) {
 			
 		}
	     
	     
	     return mine;
		
	}
	

}
