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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(slow);
        return merge(left,right);
    }
    public ListNode merge(ListNode a,ListNode b)
    {
        ListNode dummy=new ListNode();
        ListNode curr=dummy;
        while(a!=null && b!=null)
        {
            if(a.val<=b.val)
            {
                curr.next=a;
                a=a.next;
            }
            else
            {
                curr.next=b;
                b=b.next;
            }
            curr=curr.next;
        }
        while(a!=null)
        {
            curr.next=a;
            a=a.next;
            curr=curr.next;
        }
        while(b!=null)
        {
            curr.next=b;
            b=b.next;
            curr=curr.next;
        }
        return dummy.next;
    }
}