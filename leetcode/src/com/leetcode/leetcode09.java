package com.leetcode;

public class leetcode09 {

    public static boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        char[] s = num.toCharArray();
        int i;
        for(i=0;i<=(s.length/2);i++){
            if(s[i]==s[s.length-1-i]&&x>0){
                continue;
            }
            break;
        }
        if(i>=s.length/2){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int num1 = 121;
        System.out.println("num1:"+isPalindrome(num1));
        int num2= -121;
        System.out.println("num2:"+isPalindrome(num2));
        int num3 = 10;
        System.out.println("num3:"+isPalindrome(num3));

    }

}
