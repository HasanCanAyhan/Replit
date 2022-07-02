package loops_4;

import java.util.Scanner;

public class Alejandro {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String email = s.nextLine();


        String result = "";

        if(email.toLowerCase().contains("alejandro") && email.toLowerCase().contains("project")){
            result += "priority";
        }else if(email.toLowerCase().contains("alejandro")){
            result += "read";
        }else{
            result += "don't read";
        }

        System.out.println(result);




    }

}
/*
Alejandro has many emails, but only has time to read a few of them. Help him sort his inbox by checking the given email variable for his name and for the word 'project'. Use the following requirements to help Alejandro:
If the email has his name and the word 'project' print: priority
If the email has only his name, but not the word 'project' print: read
If the email does not have his name print: don't read

Input:
    dear Alejandro.....a lot of text

  Output:
    read
 */