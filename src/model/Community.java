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
public class Community {
    
    private String communityName;
    private List<Community> nearByCommunities;
    private List<Hospital> hospital;
    private String city;
    
    public Community()
    {
        List<Hospital> hospitalList = new ArrayList<>();
        this.hospital = hospitalList;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public List<Community> getNearByCommunities() {
        return nearByCommunities;
    }

    public void setNearByCommunities(List<Community> nearByCommunities) {
        this.nearByCommunities = nearByCommunities;
    }

    public List<Hospital> getHospital() {
        return hospital;
    }

    public void setHospital(List<Hospital> hospital) {
        this.hospital = hospital;
    }
    
}
