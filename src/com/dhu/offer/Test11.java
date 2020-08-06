package com.dhu.offer;

public class Test11 {

    class Solution {
        public int minArray(int[] numbers) {
            int i = 0;
            int result=0;
            for (i = 1; i < numbers.length ; i++) {
                if (numbers[i] < numbers[i -1]) {
                    result =  numbers[i];
                    break;
                }
            }
            if (i == numbers.length ) {
                result =  numbers[0];
            }
            return result;
        }
    }

}
