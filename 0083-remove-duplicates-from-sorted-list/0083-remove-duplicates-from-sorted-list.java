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
        HashMap<Integer,Boolean> map=new HashMap<>();
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode curr=dummy;
        while(curr.next!=null)
        {
            if(map.containsKey(curr.next.val))
            {
                curr.next=curr.next.next;
            }
            else
            {
                map.put(curr.next.val,true);
                curr=curr.next;
            }
             
        }
        return dummy.next;
    }
}