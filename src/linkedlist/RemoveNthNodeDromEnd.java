package linkedlist;

public class RemoveNthNodeDromEnd {

//Definition for singly-linked list.
     public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
     val = x;
     next = null;
     }
     }

        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy =new ListNode(0);
            ListNode slow= dummy;
            dummy.next= head;
            ListNode fast = head;

            for(int i=0; i<n;i++){
                fast = fast.next;
            }
            while(fast!=null){
                slow= slow.next;
                fast= fast.next;
            }
            slow.next = slow.next.next;
            return dummy.next;

        }



}
