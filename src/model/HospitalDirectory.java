/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author vrushaliphaltankar
 */
public class HospitalDirectory 
{
   // Map<String, Hospital> doctorToHospital = new HashMap<>();
    Map<String, Community> hospitalNameToCommunity = new HashMap<>();
    Map<String, CopyOnWriteArrayList <Hospital>> communityToHospitals = new HashMap<>();
    Map<String, CopyOnWriteArrayList <Doctor>> hospitalToDoctors = new HashMap<>();
    Map<String, Hospital> hospitalNameToHospital = new HashMap<>();

    public Map<String, Hospital> getHospitalNameToHospital() {
        return hospitalNameToHospital;
    }
    
    /*public Map<String, Hospital> getDoctorToHospital() {
        return doctorToHospital;
    }*/

    public Map<String, Community> getHospitalNameToCommunity() {
        return hospitalNameToCommunity;
    }

    public Map<String, CopyOnWriteArrayList <Hospital>> getCommunityToHospitals() {
        return communityToHospitals;
    }

    public Map<String, CopyOnWriteArrayList <Doctor>> getHospitalToDoctors() {
        return hospitalToDoctors;
    }
}
