/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vaccinationapp;

/**
 *
 * @author youssif
 */
public class PQElement {
    
    private int iKey;      //priority key
    private Patient patient;     //patient object
    
    
    //paramatered constructor
    public PQElement(int iInPriority, Patient inPatient){
        iKey = iInPriority; 
        patient = inPatient;
    }
    
    //setters and getters 

    public int getiKey() {
        return iKey;
    }

    public void setiKey(int iInKey) {
        iKey = iInKey;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient inPatient) {
        patient = inPatient;
    }
    
    
    public String printPatient(){
        String message; 
        message = "Name : " + patient.getpName() + " Age : " + patient.getpAge() + " Medical condition : " + patient.computeMed();
        return message;
    
    }
    
    
    
}
