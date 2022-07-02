package loops_4;

import java.util.Scanner;

public class MiddleCharacters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String result ="";

        if(word.length() % 2 != 0){
            result += word.charAt((word.length() / 2 ));
        }else{
            result += word.charAt(word.length() / 2 -1 ) +""+word.charAt(word.length()/2);
        }

        System.out.println("result = " + result);


       //  ----------------Middle Char------- Another Solution


        //WRITE YOUR CODE BELOW
        String result1 = "";
        int length = word.length();
        int odd = (length-1)/2;
        int even = (length-2)/2;

        if ((word.length())%2==0){
            result=result+word.substring(even,even+2);
        }else{
            result=result+word.substring(odd,odd+1);
        }

        System.out.println(result1);

    }

}
/*
Use String methods and if statements to find the middle character/s of the given word variable.
The value of the word will be input from a Scanner, but you only need to interact with the String variable.
 Output in the following format:
Note: Odd length words will have one middle character,
but even length words will have two middle character,
so use the length of the Strings to determine what the output should be.

Ex:
  Input:
    apples

  Output:
    pl


   Ex:
  Input:
    oak

  Output:
    a
 */
