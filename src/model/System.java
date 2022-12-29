/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vrushaliphaltankar
 */
public class System {
    
    DoctorDirectory doctorDirectory;
    PatientDirectory patientDirectory;
    PersonDirectory personDirectory;
    HospitalDirectory hospitalDirectory;
    CommunityDirectory communityDirectory;
    
    public System()
    {
        this.patientDirectory = new PatientDirectory();
        this.personDirectory = new PersonDirectory();
        this.doctorDirectory = new DoctorDirectory();
        this.hospitalDirectory = new HospitalDirectory();
        this.communityDirectory = new CommunityDirectory();
    }

    public CommunityDirectory getCommunityDirectory() {
        return communityDirectory;
    }
    
    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }
}
