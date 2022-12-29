/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author vrushaliphaltankar
 */
public class EncounterHistory {
    private Map<Doctor,CopyOnWriteArrayList <Encounter>> doctorToEncounterList = new HashMap<>();

    public Map<Doctor, CopyOnWriteArrayList <Encounter>> getDoctorToEncounterList() {
        return doctorToEncounterList;
    }

    public void setDoctorToEncounterList(Map<Doctor, CopyOnWriteArrayList <Encounter>> doctorToEncounterList) {
        this.doctorToEncounterList = doctorToEncounterList;
    }
}
