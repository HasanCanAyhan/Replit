package loops_4;

import java.util.Scanner;

public class Java_and_Python_replit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();


        int java = 0;
        int python = 0;

        for (int i = 0; i < sentence.length(); i++) {

            if(i > sentence.length()-4  || i > sentence.length() - 6){
                break;
            }

            String sub_java = sentence.substring(i,i+4);
            String sub_python = sentence.substring(i,i+6);

            if(sub_java.equals("java")){
                java++;
            }


            if(sub_python.equals("python")){

                python++;

            }

            if(!sentence.contains("java") && !sentence.contains("python")){
                System.out.println("true");
                return;
            }

        }

        if(java == python ){
            System.out.println("true");
        }else{
            System.out.println("false");
        }




    }

}
