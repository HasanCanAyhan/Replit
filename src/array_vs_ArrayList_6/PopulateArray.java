package array_vs_ArrayList_6;

import java.util.Arrays;
import java.util.Scanner;

public class PopulateArray {

    public static void main(String[] args) {

        //DO NOT TOUCH THE FOLLOWING LINES
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        populate(n);


    }

    public static void populate(int n){


        int[] arr = new int[n];

        for (int i = 0 , j = 1; i < arr.length; i++,j++) {

            arr[i] = j;

        }


        System.out.println(Arrays.toString(arr));

    }



}
/*
Create a method called populate() that will take an int argument and print an array that is populated/filled with numbers starting from 1 to the given number.
This is a void method with an int parameter
Main topics: methods, Scanner, primitive datatypes, operators, arrays, loops

Example Flow:

populate(3)

output:
  [1,2,3]
populate(5)

output:
  [1,2,3,4,5]
 */
