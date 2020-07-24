package com.dhu;

public class Test43 {
    public static void main(String[] args) {
        System.out.println(new Test43().countDigitOne(12));
    }

    public int countDigitOne(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = result + hasOne(i);
        }
        return result;
    }

    public int hasOne(int num) {
        String string = num + "";
        int flag = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '1') {
                flag++;
            }
        }
        return flag;

    }
}

