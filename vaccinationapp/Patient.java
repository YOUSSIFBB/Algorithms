/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vaccinationapp;

/**
 *
 * @author youssif
 */
public class Patient {
    
    //Variables here 
    private String pName;
    private int pAge; 
    private boolean hasMedicalCondition;
    private String med;
    
    
    //Parametered construcutor 
    
    public Patient(String pName, int pAge, boolean hasMedicalCondition){
        this.pName = pName; 
        this.pAge = pAge; 
        this.hasMedicalCondition = hasMedicalCondition;
    
    }
    
    //default construcutor
    
    public Patient(){
        pName = ""; 
        pAge = 0;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpAge() {
        return pAge;
    }

    public void setpAge(int pAge) {
        this.pAge = pAge;
    }

    public boolean isHasMedicalCondition() {
        return hasMedicalCondition;
    }

    public void setHasMedicalCondition(boolean hasMedicalCondition) {
        this.hasMedicalCondition = hasMedicalCondition;
    }
    
    //convert the boolean values to yes and no
    public String computeMed(){
        
        if(hasMedicalCondition == true){
            med = "Yes";
        }else{
            med = "No";
        }
        return med;
   
    }
    
    
   
}
