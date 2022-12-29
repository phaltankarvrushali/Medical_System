/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vrushaliphaltankar
 */
public class Doctor extends Person {

    private Hospital hospitalName;
    private String speciality;
    private List<Patient> patientList = new ArrayList<>();
    
    public Hospital getHospital() {
        return hospitalName;
    }

    public void setHospital(Hospital hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }
}
