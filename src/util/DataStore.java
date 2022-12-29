/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import acl.Role;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import model.Community;
import model.Doctor;
import model.Encounter;
import model.Hospital;
import model.House;
import model.Patient;
import model.Person;
import model.System;

/**
 *
 * @author vrushaliphaltankar
 */
public class DataStore {
    
    public static DataStore dataStore = null;
    
    Map<String,Role> roleNameToRole;
    
    Map<String, Encounter> encounterIdToEncouter;
    public System system;
    public static String patientId = "000000";
    public static String doctorId = "110000";
    
    
    public static DataStore getInstance() {
    
        if(null == dataStore) {
             
            dataStore = new DataStore(); 
            
        }
        
        return dataStore;
        
    }
    
    private DataStore() {
    
        this.system = new System();
        RoleAndPolicyHandler roleAndPolicyHandler = new RoleAndPolicyHandler();
        roleNameToRole = roleAndPolicyHandler.createRolesAndPopulateDataStore();
        encounterIdToEncouter = new HashMap<>();

        createDoctor();    
        createAdmin();
    }
        
    public Map<String, Encounter> getEncounterIdToEncouter() {
        return encounterIdToEncouter;
    }
    
    public Map<String, Role> getRoleNameToRole() {
        return roleNameToRole;
    } 

    public System getSystem() {
        return system;
    }
    
    private void createAdmin()
    {
        Person systemAdmin = new Person();
        systemAdmin.setFirstName("admin");
        systemAdmin.setLastName("");
        systemAdmin.setUserName("admin");
        systemAdmin.setPassword("admin");
        systemAdmin.setRole(roleNameToRole.get("SystemAdminRole"));
        
        system.getPersonDirectory().getUsernameToUser().put("admin", systemAdmin);
    }
    
    private void createDoctor()
    {
        Doctor drvrushali = new Doctor();

        drvrushali.setUserName("vrushali");
        drvrushali.setPassword("vrushali");
        drvrushali.setUserId("100111");
        
        drvrushali.setFirstName("Vrushali");
        drvrushali.setLastName("Phaltankar");
        drvrushali.setRole(roleNameToRole.get("DoctorRole"));
        
        Community community = new Community();
        community.setCommunityName("Boylston");
        
        system.getCommunityDirectory().getCommunityNameToCommunity().put("Boylston", community);
        
        drvrushali.setCommunity(community);
        drvrushali.setSpeciality("Cardiology");
        createPatient(drvrushali);
        
        Hospital hospital = new Hospital();
        hospital.setHospitalName("Boston Central Hospital");
        hospital.setCommunity(community);
        hospital.setStreetName("Berklee Avenue");
        
        system.getHospitalDirectory().getHospitalNameToHospital().put(hospital.getHospitalName(),hospital);
        system.getHospitalDirectory().getHospitalNameToCommunity().put(hospital.getHospitalName(),hospital.getCommunity());
        
        if( null == system.getHospitalDirectory().getCommunityToHospitals().get(community.getCommunityName()) ||
                system.getHospitalDirectory().getCommunityToHospitals().get(community.getCommunityName()).isEmpty())
        {
            CopyOnWriteArrayList <Hospital> hospitalList = new CopyOnWriteArrayList <>();
            hospitalList.add(hospital);
            system.getHospitalDirectory().getCommunityToHospitals().put(community.getCommunityName(),hospitalList);
        }
        else
        {
            system.getHospitalDirectory().getCommunityToHospitals().get(community.getCommunityName()).add(hospital);
        }
        
        if( null == system.getHospitalDirectory().getHospitalToDoctors().get(hospital.getHospitalName()) ||
                system.getHospitalDirectory().getHospitalToDoctors().get(hospital.getHospitalName()).isEmpty())
        {
            CopyOnWriteArrayList <Doctor> doctorList = new CopyOnWriteArrayList <>();
            doctorList.add(drvrushali);
            system.getHospitalDirectory().getHospitalToDoctors().put(hospital.getHospitalName(),doctorList);
        }
        else
        {
            system.getHospitalDirectory().getHospitalToDoctors().get(hospital.getHospitalName()).add(drvrushali);
        }
        
        
        
        drvrushali.setHospital(hospital);
        
        drvrushali.getPatientList().add(system.getPatientDirectory().getPatientNameToPatient().get("whatever"));
        
        system.getPersonDirectory().getUsernameToUser().put(drvrushali.getUserName(), drvrushali);
        system.getDoctorDirectory().getDoctorNameToDoctor().put(drvrushali.getUserName(), drvrushali);
        system.getDoctorDirectory().getDoctorIdToDoctor().put(drvrushali.getUserId(), drvrushali);
        
        if(null == system.getDoctorDirectory().getCommunityNameToDoctors().get(drvrushali.getCommunity().getCommunityName())
                || system.getDoctorDirectory().getCommunityNameToDoctors().get(drvrushali.getCommunity().getCommunityName()).isEmpty())
        {
            CopyOnWriteArrayList <Doctor> doctorList = new CopyOnWriteArrayList <>();
            doctorList.add(drvrushali);
            system.getDoctorDirectory().getCommunityNameToDoctors().put(drvrushali.getCommunity().getCommunityName(), doctorList);
        }
        else
        {
            system.getDoctorDirectory().getCommunityNameToDoctors().get(drvrushali.getCommunity().getCommunityName()).add(drvrushali);
        }     
    }
    
    private void createPatient(Doctor doctor)
    {
        Patient patient = new Patient();
        patient.setUserId("168447");
        
        patient.setUserName("patient");
        patient.setPassword("patient");
        
        
        patient.setFirstName("patient");
        patient.setLastName("patient");
        
        patient.setRole(roleNameToRole.get("PatientRole"));
        
        Encounter encounter = new Encounter();
        encounter.setEncounterDate(LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES));
        encounter.setBpm("65");
        encounter.setDiastolic("90");
        encounter.setSystolic("120");
        encounter.setWeight("75");
        encounter.setTemperature("98.6");
        
        House house = new House();
        patient.setAddress(house);
        
        patient.setCommunity(system.getCommunityDirectory().getCommunityNameToCommunity().get("Boylston"));
        
        if(null == patient.getEncounterHistory().getDoctorToEncounterList() || patient.getEncounterHistory().getDoctorToEncounterList().isEmpty())
        {
            Map<Doctor, CopyOnWriteArrayList <Encounter>> doctorToEncounterList = new HashMap<>();
            patient.getEncounterHistory().setDoctorToEncounterList( doctorToEncounterList);
        }
        
        if(null == patient.getEncounterHistory().getDoctorToEncounterList().get(doctor) || patient.getEncounterHistory().getDoctorToEncounterList().get(doctor).isEmpty())
        {
            CopyOnWriteArrayList <Encounter> encounterList = new CopyOnWriteArrayList <>();
            encounterList.add(encounter);
            
            patient.getEncounterHistory().getDoctorToEncounterList().put(doctor, encounterList);
            
        }
        else
        {
            patient.getEncounterHistory().getDoctorToEncounterList().get(doctor).add(encounter);
        }
        
        encounterIdToEncouter.put(encounter.getId(),encounter);
        system.getPatientDirectory().getPatientNameToPatient().put(patient.getUserName(), patient);
        system.getPatientDirectory().getPatientIdToPatient().put(patient.getUserId(), patient);
        system.getPersonDirectory().getUsernameToUser().put(patient.getUserName(), patient);   
    }
}
