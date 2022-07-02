package methods_5;

import java.util.Scanner;

public class Next3 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("enter number:");
        int num = inp.nextInt();

        next3(num);

    }

    public static void next3(int num){

        String  result = ( (num+1) + " " + (num+2) + " " + (num+3));

        System.out.println(result);

    }



}
/*
Create a method called next3() that will take an int argument and print the three numbers that come after the given number. The next3() method is already called in the main method. Print in the following format:
$number1 $number2 $number3

The three next numbers are printed on the same line with spaces between them
This is a void method with an int parameter
Main topics: methods, Scanner, primitive datatypes, operators

Example:

next3(1)

output:
  2 3 4
Example:

next3(10)

output:
  11 12 13
 */