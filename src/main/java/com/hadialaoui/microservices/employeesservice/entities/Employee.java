package com.hadialaoui.microservices.employeesservice.entities;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String refog;
	private String firstName;
	private String lastName;
	private String title;
	@ElementCollection(targetClass=String.class)
	private List<String> listTrainingCourses;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String refog, String firstName, String lastName, String title, List<String> listTrainingCourses) {
		super();
		this.refog = refog;
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		this.listTrainingCourses = listTrainingCourses;
	}
	
	public Employee(Long id, String refog, String firstName, String lastName, String title,
			List<String> listTrainingCourses) {
		super();
		this.id = id;
		this.refog = refog;
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		this.listTrainingCourses = listTrainingCourses;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRefog() {
		return refog;
	}
	public void setRefog(String refog) {
		this.refog = refog;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getListTrainingCourses() {
		return listTrainingCourses;
	}
	public void setListTrainingCourses(List<String> listTrainingCourses) {
		this.listTrainingCourses = listTrainingCourses;
	}
	
	
}
