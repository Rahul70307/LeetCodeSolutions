package linkedlist;

public class MergeTowSortedLL {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy =new ListNode(0);
        ListNode pre = dummy;
        ListNode c1 = list1;
        ListNode c2 = list2;

        while(c1!=null && c2!= null){
            if(c1.val<=c2.val){
                pre.next= c1;
                c1= c1.next;

            } else{
                pre.next= c2;
                c2= c2.next;
            }
            pre= pre.next;

        }
        if( c1!=null){
            pre.next = c1;
        } else{
            pre.next = c2;
        }
        return dummy.next;



    }


}
