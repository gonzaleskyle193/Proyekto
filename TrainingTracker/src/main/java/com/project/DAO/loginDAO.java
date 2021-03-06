package com.project.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.project.model.AccountModel;



public class loginDAO {

	private String dbURL = "jdbc:mysql://localhost:3306/employees?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private String dbUsername = "root";
	private String dbPassword = "root";
	private String dbDriver = "com.mysql.cj.jdbc.Driver";
	
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
	
	public boolean validate(AccountModel loginAccount) {
		loadDriver(dbDriver);
		Connection con = getConnection();
		boolean status = false;
		String sql = "select * from account where username = ? and password = ?";
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, loginAccount.getUsername());
			ps.setString(2, loginAccount.getPassword());
			
		ResultSet rs = ps.executeQuery();
		status = rs.next();
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
		
	}
	
}
