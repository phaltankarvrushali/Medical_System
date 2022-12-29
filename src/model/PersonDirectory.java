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
public class PersonDirectory {
    Map<String, Person> usernameToUser = new HashMap<>();

    public Map<String, Person> getUsernameToUser() {
        return usernameToUser;
    }    
}