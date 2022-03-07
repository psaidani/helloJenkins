package com.epsi;

import java.util.ArrayList;

public class Agent {
    
    String name;
    String firstname;
    String mission;
    String password;
    ArrayList<String> tools;

    
    
    public Agent(String name, String firstname, String mission, String password, ArrayList<String> tools){
        this.name = name;
        this.firstname = firstname;
        this.mission = mission;
        this.password = password;
        this.tools = tools;
    }

    public String getName() {
        return this.name;
    }

    public String getFirstname() {
        return this.firstname;
    }
    
    public String getMission() {
        return this.mission;
    }

    public String getPassword() {
        return this.password;
    }

    public ArrayList<String> getTools() {
        return this.tools;
    }
}