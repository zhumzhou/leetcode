package com.dhu.offer;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.replace("[", "");
        str = str.replace("]","");
        String[] spl = str.split(",");
        int[] arr = new int[spl.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Integer.parseInt(spl[i]);
        }

        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1 || arr[i] == 0) {

            } else {
                boolean isSushu = true; //标记
                for (int j = 2; j < arr[i]; j++) {
                    if (arr[i] % j == 0) {
                        isSushu = false;
                        break;
                    }
                }
                if (isSushu == true) {
                    integers.add(arr[i]);
                }
            }
        }
        String s = integers.toString();
        s = s.replaceAll(" ", "");
        System.out.println(s);
    }
}