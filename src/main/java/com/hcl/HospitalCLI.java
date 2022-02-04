package com.hcl;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import com.hcl.entity.*;
/**
 * 
 *
 */
public class HospitalCLI {

    public static void main(String[] args) {
    	
    	// Initialize patients
        Patient p1 = new Patient(175, "Scarlett", 55);
        Patient p2 = new Patient(178, "Aron", 48);
        Patient p3 = new Patient(152, "James", 32);
        
        // Initialize doctors
        Doctor d1 = new Doctor(20, "Turk", "Surgeon");
        Doctor d2 = new Doctor(21, "John Dorian", "Internal Medecine");
        Doctor d3 = new Doctor(18, "Carla", "Nurse");
        
        // Add patients and doctors to respective to ArrayList unsorted
        List<Patient> pList = new ArrayList<>();
        pList.add(p1);
        pList.add(p2);
        pList.add(p3);
        
        List<Doctor> dList = new ArrayList<>();
        dList.add(d1);
        dList.add(d2);
        dList.add(d3);
        
        // Print original lists for Patient and Doctor
        System.out.println("Original Patient list: ");
        for (Patient p : pList) {
        	System.out.println(p.toString());
        }
        
        System.out.println("\nOriginal Doctor list: ");
        for (Doctor d : dList) {
        	System.out.println(d.toString());
        }
        
        System.out.println("=========== Patient Sorting ===========");
        
        // Sorting patients by Id
        Comparator<Patient> patientIdComp = Comparator.comparing(Patient::getPatientId); //uses method reference
        Collections.sort(pList, patientIdComp);
        System.out.println("\nPatient Sorted by Id: ");
        for (Patient p : pList) {
        	System.out.println(p.toString());
        }
        
        // Sorting patients by name 
        Comparator<Patient> patientNameComp = Comparator.comparing(Patient::getPatientName); //uses method reference
        Collections.sort(pList, patientNameComp);
        System.out.println("\nPatient Sorted by Name: ");
        for (Patient p : pList) {
        	System.out.println(p.toString());
        }
        
        // Sorting patients by age
        Comparator<Patient> patientAgeComp = Comparator.comparing(Patient::getAge); //uses method reference
        Collections.sort(pList, patientAgeComp);
        System.out.println("\nPatient Sorted by Age: ");
        for (Patient p : pList) {
        	System.out.println(p.toString());
        }
        
        System.out.println("=========== Doctor Sorting ===========");
        
        // Sorting doctors by Id
        Comparator<Doctor> doctorIdComp = Comparator.comparing(Doctor::getDoctorId); //uses method reference
        Collections.sort(dList, doctorIdComp);
        System.out.println("\nDoctor Sorted by Id: ");
        for (Doctor d : dList) {
        	System.out.println(d.toString());
        }
        
        // Sorting doctors by name 
        Comparator<Doctor> doctorNameComp = Comparator.comparing(Doctor::getDoctorName); //uses method reference
        Collections.sort(dList, doctorNameComp);
        System.out.println("\nDoctor Sorted by Name: ");
        for (Doctor d : dList) {
        	System.out.println(d.toString());
        }
        
        // Sorting doctors by specialty
        Comparator<Doctor> doctorSpecialtyComp = Comparator.comparing(Doctor::getSpecialty); //uses method reference
        Collections.sort(dList, doctorSpecialtyComp);
        System.out.println("\nDoctor Sorted by Specialty: ");
        for (Doctor d : dList) {
        	System.out.println(d.toString());
        }
    }
}
