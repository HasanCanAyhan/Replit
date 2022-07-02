package methods_5;

import java.util.Scanner;

public class LameDB_goodQS_Achtung {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));

    }

    public static String lameDb(String db, String op, String id, String data) {

        String[] dbItems = db.split("#"); // [1etsy # 2wooden # 3spoon]

        String temp = "";

        int j = 0;

        switch (op) {

            case "delete":

                for (int i = 0; i < dbItems.length; i++) {

                    if (dbItems[i].contains(id)) {
                        temp += dbItems[i].replace(dbItems[i], "");
                        continue;
                    }

                    temp += dbItems[i] + "#";

                }


                break;

            case "edit" :

                for (int i = 0; i < dbItems.length; i++) {

                    if(dbItems[i].contains(id)){
                        temp += dbItems[i].replace(dbItems[i].substring(1),data) + "#";
                        continue;
                    }

                    temp += dbItems[i] + "#";

                }


                break;


            case "add":

                if(dbItems.length < Integer.valueOf(id)){
                    temp += db+"#"+id+data;
                }else{

                    for (int i = 0; i < dbItems.length; i++) {
                        j++;//1 , i = 0
                        if (dbItems[i].contains(id)){ // i = 0 -->> 1etsy, id = 1 , true
                            temp += j + data + "#";
                            j++; // 2
                            dbItems[i] = j + dbItems[i].substring(1);
                            temp += dbItems[i] + "#";
                            continue;
                        }

                        temp += j + dbItems[i].substring(1) + "#";


                    }


                }

                break;



        }


        if (temp.charAt(temp.length()-1) == '#'){
            temp = temp.substring(0,temp.length()-1);
        }


        return temp;
    }//end lameDb

}



