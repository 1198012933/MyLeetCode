package com.leetcode;

public class leetcode01 {

    public static int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    sum[0]=i;
                    sum[1]=j;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        int target1 = 9;
        int[] sum1 = twoSum(nums1, target1);
        System.out.println("两个整数的坐标分别为：["+sum1[0]+"]和["+sum1[1]+"]");
        int[] nums2 = {2,7,6,1};
        int target2 = 8;
        int[] sum2 = twoSum(nums2, target2);
        System.out.println("两个整数的坐标分别为：["+sum2[0]+"]和["+sum2[1]+"]");
        int[] nums3 = {1,7,11,15};
        int target3 = 16;
        int[] sum3 = twoSum(nums3, target3);
        System.out.println("两个整数的坐标分别为：["+sum3[0]+"]和["+sum3[1]+"]");
    }

}
