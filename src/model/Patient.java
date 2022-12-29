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
public class Patient extends Person {
    
    private EncounterHistory encounterHistory;
    private List<String> hospitals = new ArrayList<>();
    
    public Patient()
    {
        this.encounterHistory = new EncounterHistory();
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public List<String> getHospitals() {
        return hospitals;
    }

    public void setHospitals(List<String> hospitals) {
        this.hospitals = hospitals;
    }
    
}
