package methods_5;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println(reverse(in.next()));

    }

    public static String reverse(String input) {

        String reverse = ""; // to contain all the characters of the given string in reversed order

        for (int i = input.length() -1 ; i >= 0; i--) { // i: index number of the given string starting from last index to index 0
            reverse += input.charAt(i); // to get each characters of the string starting from last index to index zero
        }


        return reverse;
    }


}
/*
Finish the method called reverse() that will take a String input argument and returns a reversed version of input. Reverse the String meaning the characters in the end will be changed to the characters in the beginning and vice versa. The reverse() method is already called in the main method with an argument.
This is a return method with a String parameter
Main topics: methods, Scanner, loops, String, concatenation

Example:

reverse("java")

output:
  avaj

Copied!
Example:

reverse("Hello")

output:
  olleH
 */