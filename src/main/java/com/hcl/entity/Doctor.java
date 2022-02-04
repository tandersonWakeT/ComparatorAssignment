package com.hcl.entity;

public class Doctor {
	
	private int doctorId;
	private String doctorName;
	private String specialty;

	// Constructors
	public Doctor() {

		this.doctorId = 0;
		this.doctorName = "";
		this.specialty = "";
	}

	public Doctor(int doctorId, String doctorName, String specialty) {

		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialty = specialty;
	}

	// Getter and Setter methods
	public void setDoctorId(int doctorId) {

		this.doctorId = doctorId;
	}

	public void setDoctorName(String doctorName) {

		this.doctorName = doctorName;
	}

	public void setSpecialty(String specialty) {

		this.specialty = specialty;
	}

	public int getDoctorId() {

		return this.doctorId;
	}

	public String getDoctorName() {

		return this.doctorName;
	}

	public String getSpecialty() {

		return this.specialty;
	}
	
	public String toString() {
		return  "ID: " + this.doctorId + "\nName: " + this.doctorName + "\nSpecialty: " + this.specialty + "\n";
	}
}
