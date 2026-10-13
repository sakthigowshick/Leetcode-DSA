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
    public ListNode swapNodes(ListNode head, int k) {
        if(head.next==null) return head;
        ListNode len=head;
        int length=0;
        while(len!=null)
        {
            len=len.next;
            length++;
        }
        ListNode first=head;
        for(int i=1;i<k;i++)
        {
            first=first.next;
        }
        ListNode last=head;
        for(int i=0;i<length-k;i++)
        {
            last=last.next;
        }
        int temp=first.val;
        first.val=last.val;
        last.val=temp;
        return head;
    }
}