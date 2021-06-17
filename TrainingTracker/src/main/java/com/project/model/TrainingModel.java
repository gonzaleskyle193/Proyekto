package com.project.model;

import java.sql.Timestamp;

public class TrainingModel {

	private int courseId;
	private String courseName;
	private String description;
	private String trainer;
	private Timestamp start;
	private Timestamp end;
	
	
	
	
	public TrainingModel(String courseName, String description, String trainer, Timestamp start, Timestamp end) {
		super();
		this.courseName = courseName;
		this.description = description;
		this.trainer = trainer;
		this.start = start;
		this.end = end;
	}
	public TrainingModel(int courseId, String courseName, String description, String trainer, Timestamp start,
			Timestamp end) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.description = description;
		this.trainer = trainer;
		this.start = start;
		this.end = end;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public Timestamp getStart() {
		return start;
	}
	public void setStart(Timestamp start) {
		this.start = start;
	}
	public Timestamp getEnd() {
		return end;
	}
	public void setEnd(Timestamp end) {
		this.end = end;
	}
	
   

	
	


	
	
	
	
	
}
