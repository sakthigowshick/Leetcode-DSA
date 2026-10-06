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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null ||k==0) return head;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode fast=dummy;
        int length=0;
        ListNode curr=head;
        while(curr!=null)
        {
            curr=curr.next;
            length++;
        }
        if(k==length)
        {
            return head;
        }
        k=k%length;
        if(k==0)
        {
            return head;
        }
        while(k!=0)
        {
           fast=fast.next;
           k--;
        }
        ListNode slow=dummy;
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        ListNode temp=slow.next;
        ListNode temphead=temp;
        slow.next=null;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=head;
        return temphead;

        

    }
}