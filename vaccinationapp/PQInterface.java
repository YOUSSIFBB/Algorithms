/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.vaccinationapp;

/**
 *
 * @author youssif
 */
public interface PQInterface {
    
    public void enque(int key, Object element);
    
    public int size();
    
    public boolean isEmpty();
    
    public Object dequeue();
    
    public String printPQ();
    
}
