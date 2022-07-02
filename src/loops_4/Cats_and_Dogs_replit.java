package loops_4;

import java.util.Scanner;

public class Cats_and_Dogs_replit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int i = 0;
        while(str.contains("cat")){

            str = str.replaceFirst("cat","app");

            i++;
        }



        int j = 0;
        while(str.contains("dog")){

            str = str.replaceFirst("dog","app");

            j++;
        }



        boolean cat_vs_dog = i == j;

        System.out.println(cat_vs_dog);


    }
}
