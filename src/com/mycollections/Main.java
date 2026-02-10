/**
 *  Task to print greater numbers from array. And smaller numbers than given number.
 *  If no numbers according two conditions - print "-1".
 */

package com.mycollections;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *  Main class.
 */
public class Main {

    // Function to find elements greater than or equal to number k.
    public static void greaterKSorted(int arr[], int k) {

        // Creating TreeSet.
        TreeSet<Integer> set = new TreeSet<>();

        // Adding all elements of given array to set to exclude duplicates.
        for (int h = 0; h < arr.length; h++){
            set.add(arr[h]);
        }

        // Recreating array with new size.
        arr = new int[set.size()];

        // Fill array with iterator with elements from set.
        int index = 0;
        Iterator it = set.iterator();

        while(it.hasNext()){

            arr[index] = (int)it.next();
            index++;

        }

        // Printing the result to console.
        for (int i = 0; i < arr.length; i++) {

            // Condition for the last element.
            if (arr[arr.length-1] < k) {

                System.out.print(-1);
                break;

            }

            // Condition from task.
            if (arr[i] >= k) {

                System.out.print(arr[i] + " ");

            }
        }

        System.out.println();

    }

    // Function to find element less than K
    public static void smallerKSorted(int arr[], int k) {

        // Creating TreeSet.
        TreeSet<Integer> set = new TreeSet<>();

        // Adding all elements of given array to set to exclude duplicates.
        for (int h = 0; h < arr.length; h++){
            set.add(arr[h]);
        }

        // Recreating array with new size.
        arr = new int[set.size()];

        // Fill array with iterator with elements from set.
        int index = 0;
        Iterator it = set.iterator();

        while(it.hasNext()){
            arr[index] = (int)it.next();
            index++;
        }

        // Printing the result to console.
        for (int i = 0; i < arr.length; i++) {

            // Condition for the first element.
            if (arr[0] > k) {

                System.out.print(-1);
                break;

            }

            // Condition from task.
            if (arr[i] <= k) {

                System.out.print(arr[i] + " ");

            }
        }

        System.out.println();

    }



    // Main method to drive java program.
    public static void main(String[] args) {

        // Array to test greaterKSorted(int arr[], int k) and smallerKSorted(int arr[], int k) methods.
        int[] array = new int[]{2, 3, 1, 7, 8, 9, 9, 0, 4, 3, 2, 2, 7, 8};

        // Calling method greaterKSorted(int arr[], int k)
        Main.greaterKSorted(array, 5);

        // Calling method smallerKSorted(int arr[], int k)
        Main.smallerKSorted(array, 5);

        // Calling method greaterKSorted(int arr[], int k)
        Main.greaterKSorted(array, 12);

        // Calling method smallerKSorted(int arr[], int k)
        Main.smallerKSorted(array, -2);
    }

}