package com.course.model;

//not used 

public class Student {

	
	private Long id;
	
	
	private String name;
	
	
	private String standard;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getStandard() {
		return standard;
	}


	public void setStandard(String standard) {
		this.standard = standard;
	}



	public Student() {
		
	}
	
	public Student(Long id, String name, String standard) {
		super();
		this.id = id;
		this.name = name;
		this.standard = standard;
	}

	

	
	
	
}
