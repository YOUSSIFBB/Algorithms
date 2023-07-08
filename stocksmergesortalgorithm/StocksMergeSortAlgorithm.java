/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stocksmergesortalgorithm;

import java.util.*;

/**
 *
 * @author youssif Alij Student number : x20252561 this application contains
 * three classes, Main class, Stocks class that stores the stock names and
 * prices, and the MyArrayList class that performs the sort merge algorithm
 * which extends the ArrayList class functionality
 *
 * reference for Comparable Interface
 * Javapoint: 
 * :https://www.javatpoint.com/Comparable-interface-in-collection-framework
 * GeekforGeeks reference :
 * https://www.geeksforgeeks.org/comparable-interface-in-java-with-examples/
 * Java Tutotial reference :
 * https://www.tutorialspoint.com/java/number_compareto.htm#:~:text=The%20method%20compares%20the%20Number,be%20of%20the%20same%20type.
 */
public class StocksMergeSortAlgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int numberOfElements = 10;

        //varaibles that store the stock name and price, *** !!these variable are for the for loop only !! ***
        //stock name 
        String[] sNames = {"Apple Inc.", "Microsoft Corp.", "Amazon.com Inc.", "Tesla Inc.", "Facebook Inc.",
            "Alphabet Inc.", "Netflix Inc.", "Nvidia Corp.", "PayPal Inc.", "Visa Inc.",
            "Johnson & Johnson", "ADNOC Corp.", "Walmart Inc.", "Coca-Cola", "Pfizer Inc.",
            "Intel Corp.", "Playstation Inc.", "Cisco Systems Inc.", "IBM", "Mastercard Incorporated"};

        int[] sPrice = {135, 310, 1700, 620, 325, 290, 540, 215, 280, 225, 165, 145, 140, 88, 42, 50, 57, 78, 118, 380};

        MyArrayList<Stocks> myList = new MyArrayList<>();

        //***** Use the for loop for question 6 ******
        //uncommet this code for question 6 and comment out the manualy entered 10 elements below, this is because with the for loop some names and values are duplicated
        //change the value of the numberOfElements varaible to test the application with different array sizes
        /*
        //polulate the collection using for loop
        for(int i = 0; i < numberOfElements; i++){
            int randomIndex = (int) (Math.random() * sNames.length); //random by 20 since the array size is 20
            String randomSname = sNames[randomIndex];   //randomise the stock names 
            int randomSprice = sPrice[randomIndex];     //randomise the stok prices 
            myList.add(new Stocks (randomSname, randomSprice));  //store the randomised stock names and prices in the array
        }
         */
        //hard coded stock names and prices {10 elements}, comment out or remove when testing application for question 6
        myList.add(new Stocks("ADNOC Corp.", 540));
        myList.add(new Stocks("Cisco Systems Inc", 351));
        myList.add(new Stocks("Intel Corp.", 920));
        myList.add(new Stocks("IBM", 404));
        myList.add(new Stocks("Apple Inc.", 743));
        myList.add(new Stocks("PayPal Inc.", 747));
        myList.add(new Stocks("Pfizer Inc.", 867));
        myList.add(new Stocks("Visa Inc.", 885));
        myList.add(new Stocks("Coca-Cola", 159));
        myList.add(new Stocks("Facebook Inc.", 173));

        //sort elements in descending order from highest to lowest
        myList.mergeSort(0, numberOfElements - 1);

        System.out.println(myList);
        System.out.println("Merge sort of : " + myList.size() + " Number of comparisons : " + myList.getnumberOfComparisons());

    }

}
