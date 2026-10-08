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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode p=dummy;
        ListNode c=head;
        ListNode n=head.next;
        while(c!=null && n!=null)
        {
            p.next=n;
            c.next=n.next;
            n.next=c;

            p=c;
            c=p.next;
            if(c!=null)
               n=c.next;
        }
        return dummy.next;
    }
}