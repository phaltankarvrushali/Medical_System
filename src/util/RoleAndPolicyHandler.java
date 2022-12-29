/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import acl.Policy;
import acl.Role;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author vrushaliphaltankar
 */
public class RoleAndPolicyHandler {
    
    public Map<String, Role> createRolesAndPopulateDataStore() {
    
        Map<String, Role> roleNameToRole = new HashMap<>();
        Map<String,Policy> policyNameToPolicy = createPolicyAndPopulateDataStore();
        
        Role systemAdminRole = new Role();
        systemAdminRole.setRoleId("SystemAdminRole");
        List<Policy> systemAdminPolicy = new ArrayList<>();
        systemAdminPolicy.add(policyNameToPolicy.get("SystemAdminPolicy"));
        systemAdminRole.setPolicies(systemAdminPolicy);
        
        
        Role communityAdminRole = new Role();
        communityAdminRole.setRoleId("CommunityAdminRole");     
        List<Policy> communityAdminPolicy = new ArrayList<>();
        communityAdminPolicy.add(policyNameToPolicy.get("CommunityAdminPolicy"));
        communityAdminRole.setPolicies(communityAdminPolicy);
        
        Role hospitalAdminRole = new Role();
        hospitalAdminRole.setRoleId("HospitalAdminRole");     
        List<Policy> hospitalAdminPolicy = new ArrayList<>();
        hospitalAdminPolicy.add(policyNameToPolicy.get("HospitalAdminPolicy"));
        hospitalAdminRole.setPolicies(hospitalAdminPolicy);
              
        Role doctorRole = new Role();
        doctorRole.setRoleId("DoctorRole");     
        List<Policy> doctorPolicy = new ArrayList<>();
        doctorPolicy.add(policyNameToPolicy.get("DoctorPolicy"));
        doctorRole.setPolicies(doctorPolicy);
        
        Role patientRole = new Role();
        patientRole.setRoleId("PatientRole");     
        List<Policy> patientPolicy = new ArrayList<>();
        patientPolicy.add(policyNameToPolicy.get("PatientPolicy"));
        patientRole.setPolicies(patientPolicy);
        
        
        roleNameToRole.put("SystemAdminRole",systemAdminRole);
        roleNameToRole.put("CommunityAdminRole",communityAdminRole);
        roleNameToRole.put("HospitalAdminRole",hospitalAdminRole);
        roleNameToRole.put("DoctorRole",doctorRole);
        roleNameToRole.put("PatientRole",patientRole);
        
        return roleNameToRole;
        
    }
    
    public Map<String, Policy> createPolicyAndPopulateDataStore() {
    
        Map<String, Policy> policyNameToPolicy = new HashMap<>();
        //For system admin
        
        Policy systemAdminPolicy = new Policy();
        systemAdminPolicy.setPolicyId("SystemAdminPolicy");
        
        List<String> systemAdminActionsList = new ArrayList<>();
        systemAdminActionsList.add("Create");
        systemAdminActionsList.add("Update");
        systemAdminActionsList.add("Read");
        systemAdminActionsList.add("Delete");
        systemAdminActionsList.add("All");
        
        systemAdminPolicy.setActions(systemAdminActionsList);
        
        
        //For Community admin
        Policy communityAdminPolicy = new Policy();
        communityAdminPolicy.setPolicyId("CommunityAdminPolicy");
        
        List<String> communityAdminActionsList = new ArrayList<>();
        communityAdminActionsList.add("Create");
        communityAdminActionsList.add("Update");
        communityAdminActionsList.add("Read");
        communityAdminActionsList.add("CommunityAdmin");
        communityAdminPolicy.setActions(communityAdminActionsList);
        
        //For Hospital admin
        Policy hospitalAdminPolicy = new Policy();
        hospitalAdminPolicy.setPolicyId("HospitalAdminPolicy");
        
        List<String> hospitalAdminActionsList = new ArrayList<>();
        hospitalAdminActionsList.add("Create");
        hospitalAdminActionsList.add("Update");
        hospitalAdminActionsList.add("Read");
        hospitalAdminActionsList.add("HospitalAdmin");
        
        hospitalAdminPolicy.setActions(hospitalAdminActionsList);
        
        //For Doctor
        Policy doctorPolicy = new Policy();
        doctorPolicy.setPolicyId("DoctorPolicy");
        
        List<String> doctorActionsList = new ArrayList<>();
        doctorActionsList.add("Update");
        doctorActionsList.add("Read");
        doctorActionsList.add("Doctor");
        
        doctorPolicy.setActions(doctorActionsList);
        
        //For Patient
        Policy patientPolicy = new Policy();
        patientPolicy.setPolicyId("PatientPolicy");
        
        List<String> patientActionsList = new ArrayList<>();
        patientActionsList.add("Read");
        patientActionsList.add("Update");
        patientActionsList.add("Patient");
        
        patientPolicy.setActions(patientActionsList);
        
        
        policyNameToPolicy.put("SystemAdminPolicy",systemAdminPolicy);
        policyNameToPolicy.put("CommunityAdminPolicy",communityAdminPolicy);
        policyNameToPolicy.put("HospitalAdminPolicy",hospitalAdminPolicy);
        policyNameToPolicy.put("DoctorPolicy",doctorPolicy);
        policyNameToPolicy.put("PatientPolicy",patientPolicy);
        
        return policyNameToPolicy;
    }
    
}

