/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vaccinationapp;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author youssif
 */
public class GPPriorityQue implements PQInterface{
    
    private ArrayList<PQElement> priorityQueue;
    
    public GPPriorityQue(){
        priorityQueue = new ArrayList<PQElement>();
    }
    
    @Override
    public boolean isEmpty(){
        return priorityQueue.isEmpty();
    }
    
    @Override
    public int size(){
        return priorityQueue.size();
    }
    
    @Override
    public void enque(int iPriorityKey, Object patient){
        int index; 
        PQElement newElement = new PQElement(iPriorityKey, (Patient) patient);
        
        index = AutomatedPriorityQueue(iPriorityKey);
        
        if(index == size()){
            priorityQueue.add(index, newElement);
        }else{
            priorityQueue.add(index, newElement);
        }
        //new ststments here
    }
    
    
    //find and assign the que for the elemnt based on the priority key that is passed from the PQInterface method enqueue
    private int AutomatedPriorityQueue(int iNewKey) {
        boolean positionFound = false;
        int currentIndex = 0;
        PQElement curElement;
        while (currentIndex < priorityQueue.size() && !positionFound) {
            curElement = priorityQueue.get(currentIndex);
            if (curElement.getiKey() > iNewKey) {
                currentIndex = currentIndex + 1;
            } else {
                positionFound = true;
            }
        }
        return currentIndex;
    }
    
    @Override
    //remove the highest priority in the queue, this should be priority 10, after that any decending value
    public Object dequeue() {  
        //return priorityQueue.remove(0);
        
        //PQElement pqElement = priorityQueue.get(0);
        //int priority = pqElement.getiKey();
        /*
        for (PQElement pqElement : priorityQueue) {
            int priority = pqElement.getiKey();
            //System.out.println("Priority: " + priority);
            JOptionPane.showMessageDialog(null, "priority " + priority);
        }*/
         /*
         Iterator<PQElement> it = priorityQueue.iterator();
        while (it.hasNext()) {
            PQElement p = it.next();
            if (p.getiKey() == k) {
                JOptionPane.showMessageDialog(null,"element removed");
                it.remove();
            }
        }
        
        */
        return priorityQueue.remove(0); //remove the highest priority ordered on the list
        
    }
    @Override
    public String printPQ() {
        String printString = new String();
        PQElement curElement;
        for (int iCount = 0; iCount < priorityQueue.size(); iCount++) {
            curElement = priorityQueue.get(iCount);
            printString = printString.concat(curElement.printPatient() + " Priority : " + curElement.getiKey() + "\n");
        }
        return printString;
    }
   
    
}
