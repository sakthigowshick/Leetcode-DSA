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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode currl1=list1;
        ListNode currl2=list2;
        ListNode dummy=new ListNode(-1);
        ListNode dummyhead=dummy;
        while(currl1!=null && currl2!=null)
        {
            if(currl1.val>currl2.val)
            {
                dummy.next=currl2;
                currl2=currl2.next;
                dummy=dummy.next;
            }
            else
            {
                dummy.next=currl1;
                currl1=currl1.next;
                dummy=dummy.next;
            }
        }
        while(currl1!=null)
        {
            dummy.next=currl1;
            currl1=currl1.next;
            dummy=dummy.next;
        }
        while(currl2!=null)
        {
            dummy.next=currl2;
            currl2=currl2.next;
            dummy=dummy.next;
        }
        return dummyhead.next;
    }
}