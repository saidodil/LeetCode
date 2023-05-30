/**
 * 2. Add Two Numbers
 * 
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order, and each of their nodes contains a single digit. 
 * Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

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
    public ListNode addTwoNumbers(ListNode theL1, ListNode theL2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (theL1 != null || theL2 != null) {
            int sum = carry;
            if (theL1 != null) {
                sum += theL1.val;
                theL1 = theL1.next;
            }
            if (theL2 != null) {
                sum += theL2.val;
                theL2 = theL2.next;
            }

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        if (carry > 0)
            current.next = new ListNode(carry);

        return dummyHead.next;
    }
}
