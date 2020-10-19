package com.dhu.offer;


import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        byte[] bytes = s.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            if ((bytes[i] >= 65 & bytes[i] <= 90) || (bytes[i] >= 97 & bytes[i] <= 122) || bytes[i] == 32) {
                continue;
            } else {
                System.out.println("unknown name");
                return;
            }
        }
        String[] s1 = s.split(" ");
        String result = "";
        if (s1.length < 3) {
            for (int i = 0; i < s1.length; i++) {
                result = result + s1[i].toLowerCase();
            }
        } else {
            for (int i = 0; i < s1.length; i++) {
                result = result + s1[i].toLowerCase().charAt(0);
            }
        }
        System.out.println(result);
    }
}