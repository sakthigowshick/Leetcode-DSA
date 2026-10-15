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
    public int[] nextLargerNodes(ListNode head) {
        if(head.next==null) return new int[] {0};
        ListNode len=head;
        int length=0;
        while(len!=null)
        {
            len=len.next;
            length++;
        }
        int[] res=new int[length];
        ListNode curr=head;
        for(int i=0;i<length;i++)
        {
            ListNode next=curr.next;
            int max=curr.val;
            while(next!=null)
            {
                if(next.val>max)
                {
                    max=next.val;
                    break;
                }
                next=next.next;
            }
            if(max==curr.val)
            {
                res[i]=0;
            }
            else
            {
                res[i]=max;
            }
            curr=curr.next;
        }
        return res;
    }
}