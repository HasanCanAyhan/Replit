package array_vs_ArrayList_6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class GetDuplicates {

    public static int getDup(String[] r) {



        int frequency= 0;
        int sum = 0;
        String result = "";
        for (String each : r) {

            frequency = Collections.frequency(Arrays.asList(r),each);


            if(frequency == 0){
                return r.length;
            }

            if(frequency !=1 && !result.contains(each)){
                result += each;
                sum += frequency;
            }


        }




        return sum;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));

    }


}
