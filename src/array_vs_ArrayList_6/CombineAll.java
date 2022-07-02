package array_vs_ArrayList_6;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineAll {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int size2 = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }
        for(int i=0; i < size2; i++) {
            list2.add(in.nextInt());
        }

        combineAL(list, list2);

    }

    public static void combineAL(ArrayList<Integer> numbersOne, ArrayList<Integer> numbersTwo){


        ArrayList<Integer> newList = new ArrayList<>();

        newList.addAll(numbersOne);
        newList.addAll(numbersTwo);

        System.out.println(newList);

    }

}
