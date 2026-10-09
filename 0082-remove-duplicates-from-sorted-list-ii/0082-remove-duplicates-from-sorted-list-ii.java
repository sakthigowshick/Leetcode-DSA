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
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode curr=dummy;
        while(curr.next!=null)
        {
            if(map.containsKey(curr.next.val))
            {
                map.put(curr.next.val,map.get(curr.next.val)+1);
                curr=curr.next;
            }
            else
            {
                map.put(curr.next.val,1);
                curr=curr.next;
            }
        }
        ListNode dummyhead=dummy;
        ListNode curr1=dummyhead;
        while(curr1.next!=null)
        {
            if(map.get(curr1.next.val)<=1)
            {
                curr1=curr1.next;
            }
            else
            {
                curr1.next=curr1.next.next;
            }
        }
        return dummyhead.next;
    }
}