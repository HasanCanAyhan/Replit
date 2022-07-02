package loops_4;

import java.util.Scanner;

public class Sandwich {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String result = "";

        if(str.indexOf("bread") < str.lastIndexOf("bread")){

            result = str.substring(str.indexOf("d")+1,str.lastIndexOf("b"));

        }else {
            System.out.println("Nothing");
        }


        System.out.println(result);

    }


}
/*
Use String methods and if statements to find what is inside of the sandwich. A sandwich is two pieces of bread with something between them. We want to see what is between our bread pieces. There will have only one input str. Inside of the str String we will look for the first occurrence of the text 'bread' and the last occurrence of the text 'bread'. Using those two points we will pull out the text between them.
If there is not two pieces of bread print the text: nothing
Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation, if statements

Ex:
  Input:
    breadjambread

  Output:
    jam
Ex:
  Input:
    xxbreadjambreadyy

  Output:
    jam
Ex:
  Input:
    xxbreadapple

  Output:
    nothing

 */