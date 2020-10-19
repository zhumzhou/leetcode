package com.dhu.offer;

import java.text.DecimalFormat;

public class Test31 {
    public static void main(String[] args) {
        String[] res = new String[2];//分别为长度和面积
        new Test31().test(3.1,4.5,res);
        System.out.println("直角三角形的斜边长度为："+res[0]);
        System.out.println("直角三角形的面积为："+res[1]);
    }

    public void test(double a,double b,String[] res){
        DecimalFormat df=new DecimalFormat(".##");
        double c = Math.sqrt(a*a+b*b);
        double s = (a*b)/2;
        res[0] = df.format(c);//保留两位小数
        res[1] = df.format(s);
    }
}
