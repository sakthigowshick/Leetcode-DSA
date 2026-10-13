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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr=head;
        while(curr.next!=null)
        {
            ListNode temp=curr.next;
            int a=gcd(curr.val,temp.val);
            ListNode node=new ListNode(a);
            node.next=temp;
            curr.next=node;
            curr=temp;
        }
        return head;
    }
    public int gcd(int a,int b)
    {
        if(b==0)
        {
            return Math.abs(a);
        }
        return gcd(b,a%b);
    }
}