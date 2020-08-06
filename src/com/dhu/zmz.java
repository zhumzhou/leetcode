package com.dhu;

import java.util.Calendar;
import java.util.Date;

public class zmz extends Thread  {

    @Override
    public void run() {
        System.out.println("执行了run方法！");
    }

    public static void main(String[] args) {
       new zmz().start();
    }
}
