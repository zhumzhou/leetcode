package com.dhu;

/**
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: 2
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: 0
 */
public class Test53 {
    public static void main(String[] args) {
        int[] nums={2,2};
        int target = 3;
        System.out.println(new Test53().search(nums, target));
    }

    public int search(int[] nums, int target) {
        int left =0,right = nums.length-1;
        int count = 0;
        while(left<right){
            int mid = (left+right)/2;
            if(nums[mid]>=target)
                right=mid;
            if(nums[mid]<target)
                left = mid+1;
        }
        while(left<nums.length&&nums[left++]==target)
            count++;
        return count;
    }
}

