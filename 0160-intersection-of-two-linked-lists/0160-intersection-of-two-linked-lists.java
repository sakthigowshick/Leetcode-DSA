/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode,Boolean> map=new HashMap<>();
        ListNode curr=headB;
        while(curr!=null)
        {
            map.put(curr,true);
            curr=curr.next;
        }
        ListNode curr1=headA;
        while(curr1!=null)
        {
            if(map.containsKey(curr1))
            {
                return curr1;
            }
            curr1=curr1.next;
        }
        return null;
    }
}