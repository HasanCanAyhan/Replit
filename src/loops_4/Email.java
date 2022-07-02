package loops_4;

import java.util.Scanner;

public class Email {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String email = scan.next();


        String firstName = email.substring(0,1).toUpperCase()+email.substring(1,email.indexOf("_")).toLowerCase();


        String lastName = email.substring(email.indexOf("_") +1 ,email.indexOf("@")).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        
        String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        domain = domain.substring(0,1).toUpperCase() + domain.substring(1);

        System.out.println("First name: " + firstName + "\n"+ "Last name: " + lastName + "\n"+ "Domain: " + domain);





    }

}
/*
Use String methods to divide the given email into separate parts. The email will always be in this format:
firstName_lastName@domain.com
Pull apart and print the first name, last name, and domain. When printing the values all three should be in proper capitalization format - The first letter of each word is uppercase and the rest are lowercase. Output in the following format:

First name: $first name
Last name: $last name
Domain: $domain


 */
