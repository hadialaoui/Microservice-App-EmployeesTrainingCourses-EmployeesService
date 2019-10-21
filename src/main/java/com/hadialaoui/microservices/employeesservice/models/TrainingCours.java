package com.hadialaoui.microservices.employeesservice.models;

public class TrainingCours {
   private Long id;
   private String Title;
   private String descreption;
   private String numberOfHours;
   private String topics;
   
   
	public TrainingCours() {
	super();
	}

	public TrainingCours(String title, String descreption, String numberOfHours, String topics) {
	super();
	Title = title;
	this.descreption = descreption;
	this.numberOfHours = numberOfHours;
	this.topics = topics;
    }
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescreption() {
		return descreption;
	}
	public void setDescreption(String descreption) {
		this.descreption = descreption;
	}
	public String getNumberOfHours() {
		return numberOfHours;
	}
	public void setNumberOfHours(String numberOfHours) {
		this.numberOfHours = numberOfHours;
	}
	public String getTopics() {
		return topics;
	}
	public void setTopics(String topics) {
		this.topics = topics;
	}
   
   
}
