package methods_5;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));

    }



    public static String uniqueChars(String str) {

        String result = "";

        for (int i = 0; i < str.length() ; i++) {

            char each = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {

                char eachCh = str.charAt(j);

                if(!result.contains(""+each)){
                    result += each;
                }

            }


        }


        return result;
    }

}
/*
uniqueChars is a method that will accept any String and return the String with out any dupclicate characters

Examples:

uniqueChars("java") ==> "jav"
uniqueChars("mama") ==> "ma"
uniqueChars("spoon") ==> "spon"
 */