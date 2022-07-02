package methods_5;

import java.util.Scanner;

public class LameDB {


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));


    }

    public static String lameDb(String db, String op, String id, String data) {

        // op: action that will be taken on database (add, edit, or remove)
        // id: The id number that will be manipulated


        String[] arrDB = db.split("#");
        String result = "";

        switch (op) {

            case "edit":

                for (int i = 0; i < arrDB.length; i++) {

                    if (arrDB[i].contains(id)) {
                        result += arrDB[i].replace(arrDB[i].substring(1), data) + "#"; // data here : "bbb"
                        continue;
                    }

                    result += arrDB[i] + "#";


                }

                break;


            case "delete":

                for (int i = 0; i < arrDB.length; i++) {

                    if (arrDB[i].contains(id)) {
                        result += arrDB[i].replace(arrDB[i], "");
                        continue;
                    }

                    result += arrDB[i] + "#";

                }

                break;


            case "add":

                if (arrDB.length < Integer.valueOf(id)) {

                    result += db + "#" + id + data;

                } else {

                    int j = 0;
                    for (int i = 0; i < arrDB.length; i++) {

                        j++; // 1
                        if (arrDB[i].contains(id)){

                            result += j + data + "#";  // 1bbb

                            j++; // 2

                        }


                        result += j + arrDB[i].substring(1) + "#";

                    }


                    break;


                }


        }

        if (result.charAt(result.length()-1) == '#'){
            result = result.substring(0,result.length()-1);
        }


        return result;

    }

}

