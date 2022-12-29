/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import util.DataStore;

/**
 *
 * @author vrushaliphaltankar
 */
public class UserValidator {
    
    public Person validateUser(String username) {
    
       Person user = DataStore.getInstance().getSystem().getPersonDirectory().getUsernameToUser().get(username);
       return user;
    }
    
}
