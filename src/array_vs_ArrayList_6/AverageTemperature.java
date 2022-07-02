package array_vs_ArrayList_6;

import java.util.Scanner;

public class AverageTemperature {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };


        double length = temps.length;

        double sum = 0;

        for (double each : temps) {

            sum += each;
        }

        double avg =  sum / length;

        System.out.println(avg);
    }

}
/*
Given a double [] temps that has the temperature values from the previous couple day, find and print the average temperature
Note: The loop used in the given code is to dynamically create the double array. You don't need to fully understand this part yet, focus only on having access to an array and has some numbers.
Main topics: arrays, primitive datatypes, concatenation, index, operators, loops

Example:

Input:
  [80, 88, 88, 84, 82, 78, 60, 68]

Output:
  78.5
 */