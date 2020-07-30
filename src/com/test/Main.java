package com.test;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        // 创建一个key和value均为String的Map集合
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "11");
        map.put("2", "22");
        map.put("3", "33");
        // 键和值
        String key = null;
        String value = null;
        // 获取键值对的迭代器
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            key = (String) entry.getKey();
            value = (String) entry.getValue();
            System.out.println("key:" + key + "---" + "value:" + value);
        }

    }


}



