import java.util.*;

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        int i = 0;
        ListNode hold = head;
        
        while (hold!=null){
            length++;
            hold = hold.next;
        }
        
        hold = head;
        while (hold!=null){
            if (length-n == 0) return head.next;
            if (i == length-n-1){
                hold.next = hold.next.next;
            }
            hold = hold.next;
            i++;
        }
        return head;
    }
}