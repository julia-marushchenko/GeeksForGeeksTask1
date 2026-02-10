/**
 *  Task from GeeksFromGeeks: You are given two arrays of size n1 and n2.
 *  Your task is to find all the elements that are common to both the arrays and sum them.
 *  If there are no common elements the output would be 0.
 */
package com.mycollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *  Geeks class.
 */
class Geeks {
    public static int commonSum(int n1, int n2, int arr1[], int arr2[]) {
        
        // Creating integer number.
        int number = 0;
        
        // Creating set of numbers from arr1.
        Set<Integer> set1 = new HashSet<>();
        
        // Creating set of numbers from arr2.
        Set<Integer> set2 = new HashSet<>();
        
        
        // Iterating through arr1 and adding elements to set1.
        for (int i = 0; i < n1; i++) {
            
            set1.add(arr1[i]);
            
        }
        
        // Iterating through arr and adding elements to set2.
        for (int j = 0; j < n2; j++) {
                
            set2.add(arr2[j]);
                
        }
        
        // Creating iterator for set1.
        Iterator it1 = set1.iterator();
        
        
        // Comparing elements from both sets and summarizing them.
        while (it1.hasNext()) {
            
            // Integer first number.
            int number1 =(int) it1.next();
            
            // Creating iterator for set2.
            Iterator it2 = set2.iterator();
            
            // Checking if elements if available.
            while (it2.hasNext()) {
                
                // Integer second number.
                int number2 = (int)it2.next();
                
                // Comparing elements.
                if (number1 == number2) {
                    
                    // Summarizing.
                    number+=number1;
                }
            }   
        }
        return number;
    }
}

/**
 *  Main class.
 */
public class Main {

    // Main method to drive java program.
    public static void main(String[] args) {

        // Creating an array of integers.
        int[] arr1 = {1, 2, 4, 2, 5, 2, 8, 9, 11};

        // Creating an array of integers.
        int[] arr2 = {5, 2, 8, 9, 11, 8, 7, 4};

        // Calling method commonSum() and printing the result to console.
        System.out.println(Geeks.commonSum(9, 8, arr1, arr2));

    }
}
