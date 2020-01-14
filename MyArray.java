package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class MyArray {
    public static void arrayMethod() {
        Scanner in=new Scanner(System.in);
        System.out.print("Input a number: ");
        int num=in.nextInt();
        int[] myArray=new int[num];


        for (int i=0; i<myArray.length; i++) {
            Scanner sc=new Scanner(System.in);
            int n=1;

            do {
                System.out.println("Please enter number!");

                while (!sc.hasNextInt()) {
                    System.out.println("That not a number!");
                    sc.next();
                }
                myArray[i]=sc.nextInt();
            } while (n<1);
        }

        ArrayList<Integer> list=new ArrayList<Integer>();

        for (int j=0; j<myArray.length; j++) {
            list.add(myArray[j]);
        }
        Collections.sort(list);
        for (int str : list) {
            System.out.print(" "+str);
        }
    }

    public static void main(String[] args) {
        arrayMethod();
    }
}

