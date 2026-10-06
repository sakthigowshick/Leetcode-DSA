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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode curr=head;
        ListNode temp=head.next;
        ListNode even=temp;
        while(temp!=null && temp.next!=null)
        {
            curr.next=temp.next;
            curr=curr.next;
            
            temp.next=curr.next;
            temp=temp.next;
        }
        curr.next=even;
        return head;

    }
}