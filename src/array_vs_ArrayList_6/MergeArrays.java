package array_vs_ArrayList_6;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int [] nums = new int[in.nextInt()];
        int [] nums2 = new int[in.nextInt()];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(merge(nums, nums2)));


    }

    public static int[] merge(int[] a,int[] b) {

        int[] new_arr = new int[a.length + b.length];

        int k = 0;
        for (int i = 0; i < a.length; i++,k++) {
            new_arr[k] = a[i];

        }


        for (int j = 0; j < b.length; j++,k++) {

            new_arr[k] = b[j];
        }

        return new_arr;

    }//end mergR



}
