package loops_4;

import java.util.Scanner;

public class CountHi_replit {

    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string:");
        String str = scan.nextLine();
        int count = 0;
        for (int i = 0; i < str.length() ; i++) {

            if(i > str.length() - 2 ){
                break;
            }else{
                String sub = str.substring(i,i+2);

                if(sub.contains("hi")){
                    count++;
                }
            }

        }

        System.out.println(count);

    }
}
