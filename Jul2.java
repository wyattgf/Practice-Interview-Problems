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
    public boolean isValid(String s) {
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if (map.containsKey(c)){
                char top = stack.isEmpty() ? '#' : stack.pop();
                
                if (top != map.get(c)) return false;
                
            }
            else {
                stack.push(c);
            }
        }
        
       return stack.isEmpty(); 
        
    }


}

public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null) return l2;
    if (l2 == null) return l1;
            
    if (l1.val <= l2.val) {
        l1.next = mergeTwoLists(l1.next, l2);
        return l1;
    } else {
        l2.next = mergeTwoLists(l1, l2.next);
        return l2;
    }  
}


/**
 * 
 * 
 * if (s.length() == 0)  return true;
        while (s.indexOf("(") !=-1){
            int index = s.indexOf('(');
            if (s.charAt(index+1) != ')') return false;
            s.replaceFirst("()", ""); 
        }
        while (s.indexOf("{") !=-1){
            int index = s.indexOf('{');
            if (s.charAt(index+1) != '}') return false;
            s.replaceFirst("{}", ""); 
        }
        while (s.indexOf("[") !=-1){
            int index = s.indexOf('[');
            if (s.charAt(index+1) != ']') return false;
            s.replaceFirst("[]", ""); 
        }
        return true;






        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val > l2.val){
                ListNode hold = l1;
                l1 = l2;
                l2 = hold;
            }
        
        ListNode head = l1;
        while (l1!=null && l2!=null){
            if (l1.val > l2.val){
                ListNode hold = l1;
                l1 = l2;
                l2 = hold;
            }
            //placeholders
            ListNode restl1 = l1.next;
            ListNode restl2 = l2.next;
            //do work
            l1.next = l2;
            //reset
            l1.next.next = restl1;
            l2 = restl2;
            //increment
            l1 = l1.next.next;
        }
        return head;
 */



