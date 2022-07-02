package loops_4;

import java.util.Scanner;

public class Party_replit {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Please enter the guest's name:");

        String  fN = input.next();

        String result = fN ;


        String answer = "yes";


        while (answer.equals("yes")){


            System.out.println("Do you want to enter another guest's name?");
            answer = input.next();

            if(answer.equals("no")){
                System.out.println("Guests' list: "+result);
                break;
            }


            System.out.println("Please enter the guest's name:");

            fN = input.next();
            result += ", "+fN;






        }


    }


}
