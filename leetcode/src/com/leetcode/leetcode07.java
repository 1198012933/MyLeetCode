package com.leetcode;

public class leetcode07 {

    public static int reverse(int x) {
        int res = 0;
        while(x!=0){
            if(res<Integer.MIN_VALUE/10||res>Integer.MAX_VALUE/10){
                return 0;
            }
            int t = x%10;
            x= x/10;
            res = res*10 + t;
        }
        return res;
    }

    public static void main(String[] args) {
        int num1 = 123;
        System.out.println("num1:"+reverse(num1));
        int num2 = 1231;
        System.out.println("num2:"+reverse(num2));
        int num3 = 1213;
        System.out.println("num3:"+reverse(num3));
    }

}
