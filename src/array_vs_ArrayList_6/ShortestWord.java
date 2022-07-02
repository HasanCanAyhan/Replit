package array_vs_ArrayList_6;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestWord {

    public static void main(String[] args) {

        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW
        str = str.trim();
        String[] arr = str.split(", ");
        System.out.println(Arrays.toString(arr));

        int minLength = arr[0].length(); // 4
        int index = 0;
        String result = "";
        for (int i = 0; i < arr.length; i++) {


            if( arr[i].length() < minLength){

                minLength = arr[i].length();
                index = i;

            }


        }

        for (String each : arr) {

            if(each.length() == arr[index].length()){
                result += each+ " ";
            }

        }

        result = result.trim();
        String[] final_result = result.split(" ");
        System.out.println(Arrays.toString(final_result) );

    }

}
/*
Given a String str, find and print the shortest words. The String will have multiple words separated by commas and spaces. If there is words that have the same length, they should all be displayed at the end. Print all the shortest words in the following format:
Input: word1, word2, word3, word4, etc...

Output: [short1, short2, short3, etc...]

Hint: Think about what comes between each word in the sentence

Main topics: arrays, String, loops, if statements, primitive datatypes, operators

Example:

Input:
  olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

Output:
  [old, cat, ray]
 */