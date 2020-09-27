package com.dhu.offer;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.replace("{", "");
        str = str.replace("}","");
        String[] spl = str.split(",");
        int[][] arr = new int[spl.length][2];
        for (int i = 0; i < arr.length; i++) {

        }

    }



}
