package methods_5;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbers {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array!!!");
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);

    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE

        for (int k = 0; k < nums.length; k++) {

            int count = 0;
            for (int each : nums) {

                if(nums[k] == each){
                    count++;
                }

            }

            if (count == 1){
                System.out.println(nums[k]);
            }
        }







    }



}
