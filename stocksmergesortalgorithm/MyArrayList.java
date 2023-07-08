/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stocksmergesortalgorithm;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author youssif Alij Student number : x20252561 Please note that this code is
 * written full by me and is a reference to the work done in class, Week 10 -
 * Merge Sort and Quick Sort
 */
public class MyArrayList<ElementType> extends ArrayList<ElementType> {

    int numberOfComparisons = 0;    //comaprisons counter 

    public void mergeSort(int start, int end) {
        if (start < end) {

            int middle = (start + end) / 2; //calulate the middle index

            mergeSort(start, middle);    //recusrive operation, call the mergeSort method for the both halfes of the array to be sorted
            mergeSort(middle + 1, end);
            merge(start, middle, end);
        } else {
            return;
        }
    }//end of mergeSort () method

    //start the merging process
    public void merge(int iLeft, int iMiddle, int iRight) {
        //inistailize counters
        int iCount = iLeft;
        int jCount = iMiddle + 1;
        int kCount = 0;

        ArrayList<Object> temMergeArray = new ArrayList<Object>(); //array that stores the merged elements
        
        //add the smalles element to the array untill the left or right (up / down) sublists are exhausted
        while (iCount <= iMiddle && jCount <= iRight) {

            //comparisn counter each time the stament is executed
            numberOfComparisons++;

            if (((Comparable) get(iCount)).compareTo((Comparable) get(jCount)) < 0) { //descending order
                temMergeArray.add(kCount, get(iCount));
                iCount = iCount + 1;
            } else {
                temMergeArray.add(kCount, get(jCount));
                jCount = jCount + 1;
            }
            kCount = kCount + 1;
        }//end of While loop

        //this while loop is execute if there are any elements left in the first half of the array, this will copy them over to the temMergeArray
        while (iCount <= iMiddle) {
            temMergeArray.add(kCount, get(iCount));
            kCount = kCount + 1;
            iCount = iCount + 1;
        }

        //this while loop also does the same thing but to the other half of the array which is the right side, it compies them over to the temMergeArray
        while (jCount <= iRight) {
            temMergeArray.add(kCount, get(jCount));
            kCount = kCount + 1; //************** flip
            jCount = jCount + 1;

        }
        //copy the temMergeArray that holds the merged elements into the original array
        for (iCount = iLeft, kCount = 0; iCount <= iRight; iCount++, kCount++) {
            set(iCount, (ElementType) temMergeArray.get(kCount));
        }

    }//end of merge () method

    //get method for numberOfComparisons varaible
    public int getnumberOfComparisons() {
        return numberOfComparisons;
    }

}
