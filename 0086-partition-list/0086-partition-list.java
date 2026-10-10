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
    public ListNode partition(ListNode head, int x) {
        ListNode beforehead=new ListNode(-1);
        ListNode before=beforehead;
        ListNode afterhead=new ListNode(-1);
        ListNode after=afterhead;
        ListNode curr=head;
        while(curr!=null)
        {
            if(curr.val<x)
            {
                before.next=curr;
                before=before.next;
            }
            else
            {
                after.next=curr;
                after=after.next;
            }
            curr=curr.next;
        }
        after.next=null;
        before.next=afterhead.next;
        return beforehead.next;
    }
}