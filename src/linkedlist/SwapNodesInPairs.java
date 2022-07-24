package linkedlist;

public class SwapNodesInPairs {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    class Solution {
        public ListNode swapPairs(ListNode head) {


            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode pre = dummy;
            ListNode curnt = head;

            while( curnt != null && curnt.next != null){
                pre.next = curnt.next;
                curnt.next = curnt.next.next;
                pre.next.next = curnt;
                pre= curnt;
                curnt= curnt.next;

            }
            return dummy.next;
        }
    }


}
