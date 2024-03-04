/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode current = head;
        String temp = "";
        while(current != null){
            temp = temp + current.val;
            current = current.next;
        }
        System.out.println(temp);
        return Integer.parseInt(temp, 2);
    }
}