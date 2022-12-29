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
public class CommunityDirectory {
    
    Map<String, Community> communityNameToCommunity = new HashMap<>();

    public Map<String, Community> getCommunityNameToCommunity() {
        return communityNameToCommunity;
    }
}
