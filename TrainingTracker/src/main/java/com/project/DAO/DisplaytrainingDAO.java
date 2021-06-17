package com.project.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.project.model.TrainingModel;

public class DisplaytrainingDAO {

	private String jdbcURL = "jdbc:mysql://localhost:3306/employees?useTimezone=true&serverTimezone=UTC";
	private String jdbcUsername = "root";
	private String jdbcPassword = "root";
	
	private static final String All_Training = "select * from training";
	private static final String SELECT_TRAIN_BY_ID = "select course_id,coursename,description,trainer,startDate,endDate from training where course_id =?";
	
	public DisplaytrainingDAO() {
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
	
	 public List<TrainingModel> selectAllTraining() throws ClassNotFoundException{
	     
	    	// using try-with-resources to avoid closing resources (boiler plate code)
	 		List<TrainingModel> training = new ArrayList<>();
	 		// Step 1: Establishing a Connection
	 		try (Connection connection = getConnection();

	 				// Step 2:Create a statement using connection object
	 			PreparedStatement preparedStatement = connection.prepareStatement(All_Training);) {
	 			System.out.println(preparedStatement);
	 			// Step 3: Execute the query or update query
	 			ResultSet rs = preparedStatement.executeQuery();

	 			// Step 4: Process the ResultSet object.
	 			while (rs.next()) {
	 				int courseId = rs.getInt("course_id");
	 				String courseName  = rs.getString("coursename");
	 				String description = rs.getString("description");
	 				String trainer = rs.getString("trainer");
	 				Timestamp start = rs.getTimestamp("startDate");
	 				Timestamp end = rs.getTimestamp("endDate");
	 				training.add(new TrainingModel(courseId, courseName, description, trainer, start, end));
	 					 			}
	 		} catch (SQLException e) {
	 			
	 		}
	 		return training;
	     }

	public TrainingModel selectTrain(int id) throws SQLException, ClassNotFoundException {
		TrainingModel train = null;
		
	        Connection connection = getConnection();
				// Step 2:Create a statement using connection object
		    PreparedStatement preparedStatement = connection.prepareStatement(SELECT_TRAIN_BY_ID);
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				int courseId = rs.getInt("course_id");
 				String courseName  = rs.getString("coursename");
 				String description = rs.getString("description");
 				String trainer = rs.getString("trainer");
 				Timestamp start = rs.getTimestamp("startDate");
 				Timestamp end = rs.getTimestamp("endDate");
				train = new TrainingModel (courseId, courseName, description, trainer, start, end);
			}
		
		
		return train;
		
	}

	
	    			
	 
}
