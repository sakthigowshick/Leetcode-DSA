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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null) return head;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode prev=dummy;
        for(int i=1;i<left;i++)
        {
            prev=prev.next;
        }
        ListNode curr=prev.next;
        ListNode nextNode=curr.next;
        for(int i=0;i<right-left;i++)
        {
            curr.next=nextNode.next;
            nextNode.next=prev.next;
            prev.next=nextNode;
            nextNode=curr.next;
        }
        return dummy.next;
    }
}