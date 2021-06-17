package com.project.model;

public class ReceiptModel {

	private int receipt_id;
	private String username;
	private String courseName;
	
	public ReceiptModel(int receipt_id, String username, String courseName) {
		super();
		this.receipt_id = receipt_id;
		this.username = username;
		this.courseName = courseName;
	}

	public ReceiptModel(String username, String courseName) {
		super();
		this.username = username;
		this.courseName = courseName;
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

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	

	
}
