package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println(1234%10000/10000);
        ListNode temp = new ListNode(5);
        ListNode one = new ListNode(1, temp);
        ListNode two = new ListNode(3, temp);
        ListNode ret = addTwoNumbers(one,two);
        int n = 0;
        while(ret.next != null){
            n++;
            ret = ret.next;
        }
        System.out.println(n );
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int placeVal = 1;
        int numOne = 0;
        int numTwo = 0;
        while(l1 != null){
            numOne += (l1.val * placeVal);
            placeVal *= 10;
            if(l1.next != null) {
                l1 = l1.next;
            }else{
                break;
            }
        }
        placeVal = 1;
        while(l2 != null){
            numTwo += (l2.val * placeVal);
            placeVal *= 10;
            if(l2.next != null){
                l2 = l2.next;
            }
            else{
                break;
            }

        }
        ListNode head = new ListNode();
        ListNode ans = head;
        String num = Integer.toString(numOne+numTwo);
        int c = 0;
        while(c != num.length()-1){
            if(c == 0 ){
                ans.val = Integer.parseInt(String.valueOf(num.charAt(0)));
            }
            else{
                ans = ans.next;
                ans.val = Integer.parseInt(String.valueOf(num.charAt(c)));
            }
            c++;
        }
        return head;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
