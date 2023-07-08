/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stocksmergesortalgorithm;

/**
 *
 * @author youssif reference for Comparable Interface
 * :https://www.javatpoint.com/Comparable-interface-in-collection-framework
 * GeekforGeeks reference :
 * https://www.geeksforgeeks.org/comparable-interface-in-java-with-examples/
 * https://www.tutorialspoint.com/java/number_compareto.htm#:~:text=The%20method%20compares%20the%20Number,be%20of%20the%20same%20type.
 */
public class Stocks implements Comparable<Stocks> { //implement comparable interface to compare objects 
    
    private String sName;
    private int sPrice;

    public Stocks(String sName, int sPrice) {// pram constructor
        this.sName = sName;
        this.sPrice = sPrice;

    }

    public String getName() {
        return sName;
    }

    public int getPrice() {
        return sPrice;

    }
    //compare the price object in the array
    public int compareTo(Stocks otherStocks) {
        return Integer.compare(otherStocks.getPrice(), this.sPrice);
    }
    //represent the data as string to combine the stock name and price
    @Override
    public String toString() {
        return sName + " " + "$" + sPrice;
    }

}
