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
public class DoctorDirectory {
    Map<String, Doctor> doctorIdToDoctor = new HashMap<>();
    Map<String, Doctor> doctorNameToDoctor = new HashMap<>();
    Map<String, CopyOnWriteArrayList <Doctor>> communityNameToDoctors = new HashMap<>();
 
    public Map<String, Doctor> getDoctorIdToDoctor() {
        return doctorIdToDoctor;
    }

    public Map<String, Doctor> getDoctorNameToDoctor() {
        return doctorNameToDoctor;
    }

    public Map<String, CopyOnWriteArrayList <Doctor>> getCommunityNameToDoctors() {
        return communityNameToDoctors;
    }
}
