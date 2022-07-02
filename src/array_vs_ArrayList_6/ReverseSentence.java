package array_vs_ArrayList_6;

import java.util.Scanner;

public class ReverseSentence {

    public static void main(String[] args) {

        // DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        // TYPE YOUR CODE BELOW:

        sentence = sentence.trim();
        String[] arr = sentence.split(" ");

        String result = "";
        for (int i = arr.length - 1; i >= 0; i--) {

           result += arr[i] + " ";
        }

        result = result.trim();

        System.out.println(result);




    }
}
/*
Given a String sentence print a version with the words reversed. The order of the words is changed, not the letters.
Hint: Think about what comes between each word in the sentence

Main topics: arrays, String, concatenation, index, primitive dataypes

Example:

Input:
  Java is fun

Output:
  fun is Java
Example:

Input:
  Hello! How are you?

Output:
  you? are How Hello!
 */