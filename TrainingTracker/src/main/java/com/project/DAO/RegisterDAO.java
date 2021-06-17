package com.project.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.project.model.AccountModel;
import com.project.model.EmployeeModel;

public class RegisterDAO {

	private String dbURL = "jdbc:mysql://localhost:3306/employees?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private String dbUsername = "root";
	private String dbPassword = "root";
	private String dbDriver = "com.mysql.cj.jdbc.Driver";
	
	public RegisterDAO() {
		
	}
	
	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	{
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbURL,dbUsername,dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public String insertInfo(EmployeeModel newEmp) {
		
		loadDriver(dbDriver);
		Connection con = getConnection();
		String result = "Data Entered";
		String sql = "INSERT INTO employeeinfo" + "(firstName,lastName,email,contact,manager) VALUES" + "(?,?,?,?,?);";
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, newEmp.getFirstname());
			ps.setString(2, newEmp.getLastname());
			ps.setString(3, newEmp.getEmail());
			ps.setString(4, newEmp.getContact());
			ps.setString(5, newEmp.getManager());
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Data insert failed";
		}
		
		
		return result;
	}
	public String insertAcc(AccountModel newAcc) {
		
		loadDriver(dbDriver);
		Connection con = getConnection();
		String result = "Data Entered";
		String sql = "INSERT INTO account" + "(username,password) values" + "(?,?);";
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, newAcc.getUsername());
			ps.setString(2, newAcc.getPassword());
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
		return result;
	}

	
}
