//83. Remove Duplicates from Sorted List
//
// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
package linkedlist;

public class RemoveDuplicatsFromSortedLL {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    } public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }else{
            ListNode current = head;
            ListNode temp= current.next;
            while (temp!=null){
                if(current.val!=temp.val){
                    current.next=temp;
                    current=current.next;
                    temp=temp.next;
                }
                else{
                    temp=temp.next;
                    //current.next=temp;

                }
            }
            return head;

        }

    }

}
