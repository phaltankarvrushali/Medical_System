/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import acl.Role;

/**
 *
 * @author vrushaliphaltankar
 */
public class Person extends PersonalDetails {
    
    protected House address;
    protected String userId;
    protected Role role;
    protected String userName;
    protected String password;
    protected Community community;
    
    public Person()
    {
        this.community = new Community();
        this.address = new House();
    }

    public Community getCommunity() {
        return community;
    }
    
    public void setCommunity(Community community) {
        this.community = community;
    }
    
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public House getAddress() {
        return address;
    }

    public void setAddress(House address) {
        this.address = address;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
