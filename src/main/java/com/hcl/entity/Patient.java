package com.hcl.entity;

public class Patient {

	private int patientId;
	private String patientName;
	private int age;

	// Constructors
	public Patient() {

		this.patientId = 0;
		this.patientName = "";
		this.age = 0;
	}

	public Patient(int patientId, String patientName, int age) {

		this.patientId = patientId;
		this.patientName = patientName;
		this.age = age;
	}

	// Getter and Setter methods
	public void setPatientId(int patientId) {

		this.patientId = patientId;
	}

	public void setPatientName(String patientName) {

		this.patientName = patientName;
	}

	public void setAge(int age) {

		this.age = age;
	}

	public int getPatientId() {

		return this.patientId;
	}

	public String getPatientName() {

		return this.patientName;
	}

	public int getAge() {

		return this.age;
	}
	
	public String toString() {
		return  "ID: " + this.patientId + "\nName: " + this.patientName + "\nAge: " + this.age + "\n";
	}

}
