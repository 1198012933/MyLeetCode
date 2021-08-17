package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode02 {

    int count = 0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null&&count==0) return null;
        if(l1==null&&l2!=null&&count==0) return l2;
        else if(l1!=null&&l2==null&&count==0) return l1;
        int sum = (l1==null?0:l1.val)+(l2==null?0:l2.val)+count;
        count = sum / 10;
        ListNode node  = new ListNode(sum % 10);
        node.next = addTwoNumbers(l1==null?null:l1.next,l2==null?null:l2.next);
        return node;
    }

    public ListNode toListNode(int[] nums){
        ListNode h = new ListNode(nums[0]);
        ListNode listNode1 = h;
        for (int i=1; i<nums.length; i++){
            ListNode listNode2 = new ListNode(nums[i]);
            listNode1.next = listNode2;
            listNode1 = listNode2;
        }
        return h;
    }
    public List show(ListNode listNode){
        ArrayList<Integer> list = new ArrayList<>();
        while (listNode!=null){
            list.add(listNode.val);
            listNode = listNode.next;

        }
        return list;
    }

    public static void main(String[] args) {
        leetcode02 leetcode = new leetcode02();
        int[] l1 = {2,4,3};
        int[] l2 = {5,6,1};
        ListNode listNode1 = leetcode.addTwoNumbers(leetcode.toListNode(l1),leetcode.toListNode(l2));
        System.out.println("结果1:"+leetcode.show(listNode1));
        int[] l3 = {3,4,3,7};
        int[] l4 = {5,6,1};
        ListNode listNode2 = leetcode.addTwoNumbers(leetcode.toListNode(l3),leetcode.toListNode(l4));
        System.out.println("结果2:"+leetcode.show(listNode2));
        int[] l5 = {4,3,8};
        int[] l6 = {5,7,1};
        ListNode listNode3 = leetcode.addTwoNumbers(leetcode.toListNode(l5),leetcode.toListNode(l6));
        System.out.println("结果3:"+leetcode.show(listNode3));
    }

}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}