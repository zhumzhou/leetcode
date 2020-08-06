package com.dhu;

import java.util.Stack;

public class CQueue {

    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(1);
        System.out.println(cQueue.deleteHead());
    }
    Stack<Integer> s1 ;
    Stack<Integer> s2 ;

    public CQueue() {
         s1 = new Stack<>();
         s2 = new Stack<>();
    }

    public void appendTail(int value) {
        s1.push(value);
    }

    public int deleteHead() {
        int result = 0;
        if (s2.size() == 0) {
            if (s1.size() == 0) {
                result = -1;
            } else {
                while (s1.size() != 0) {
                    s2.push(s1.pop());
                }
                result = s2.pop();
            }
        } else {
            result = s2.pop();
        }
        return result;
    }
}