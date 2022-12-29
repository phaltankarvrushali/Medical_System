/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author vrushaliphaltankar
 */
public class PatientDirectory {
    Map<String, Patient> patientNameToPatient = new HashMap<>();
    Map<String, Patient> patientIdToPatient = new HashMap<>();

    public Map<String, Patient> getPatientNameToPatient() {
        return patientNameToPatient;
    }

    public Map<String, Patient> getPatientIdToPatient() {
        return patientIdToPatient;
    }    
}
