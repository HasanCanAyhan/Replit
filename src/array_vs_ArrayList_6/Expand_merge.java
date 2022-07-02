package array_vs_ArrayList_6;

import java.util.Arrays;
import java.util.Scanner;

public class Expand_merge {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int[] nums = new int[3];
        int[] new_arr = new int[2* nums.length];
        for(int i =0; i < 3; i++) {
            nums[i] = scan.nextInt();
            new_arr[i] = nums[i];
        }





        System.out.println(Arrays.toString(new_arr));


    }

}
/*
Given an int [] nums create a new array that is an expanding version of nums. The new array will hold double the elements, and the original elements from nums should be stored at the beginning of the new array. You can assume the size of nums will be 3.
Note: The loop used in the given code is to dynamically create the int array. You don't need to fully understand this part yet, focus only on having access to an array and has some numbers.
Main topics: arrays, primitive datatypes, concatenation, index, operators

Example:

Input:
  [4, 5, 6]

Output:
  [4, 5, 6, 0, 0, 0]
Example:

Input:
  [3, 100, 140]

Output:
  [3, 100, 140, 0, 0, 0]
 */