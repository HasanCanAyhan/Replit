package loops_4;

import java.util.Scanner;

public class CountTriples {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String str = scan.next(); // abcXXXabc


        int count = 0;

        for (int i = 0; i < str.length() -2 ; i++) {

            char each = str.charAt(i);

            if(each == str.charAt(i+1) && each == str.charAt(i+2) ){
                count++;
            }

        }


        System.out.println("count = " + count);

        }



    }

/*

Use a loop to count the number of triples in the given str.
A triple is when the same character appears three times in a row.
So if there is a specific character that is repeated three times, that will be counted as one triple.
Print the total number of triples found in the String. The triples may overlap.

Ex:
  Input:
    abcXXXabc

  Output:
    1



 */
