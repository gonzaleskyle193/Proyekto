package com.project.DAO;

public class myTrainingModel {

	private int receipt_id;
	private String username;
	private String coursename;
	
	public myTrainingModel(int receipt_id, String username, String coursename) {
		super();
		this.receipt_id = receipt_id;
		this.username = username;
		this.coursename = coursename;
	}

	public myTrainingModel(String username, String coursename) {
		super();
		this.username = username;
		this.coursename = coursename;
	}

	public int getReceipt_id() {
		return receipt_id;
	}

	public void setReceipt_id(int receipt_id) {
		this.receipt_id = receipt_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	
	
	
}
