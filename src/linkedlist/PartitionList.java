package linkedlist;

import java.util.List;

 class PartitionList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode c1 = head;

        c1.next = new ListNode(4);
        c1=c1.next;
        c1.next = new ListNode(3);
        c1=c1.next;
        c1.next = new ListNode(1);
        c1=c1.next;
        c1.next = new ListNode(2);
        c1=c1.next;
        c1.next = new ListNode(5);
        c1=c1.next;
        c1.next = new ListNode(2);
        c1=c1.next;

        ListNode temp = head;
        while( temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }

            System.out.println(" ");

        ListNode result = partition(head,3);
        temp = result;
        while( temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }


    }


public static ListNode partition(ListNode head, int x) {
    ListNode dummy= new ListNode(0);
    ListNode itr = dummy;
    ListNode pre = itr;
    dummy.next = head;
    ListNode curnt=head;
    ListNode future ;

    while(curnt != null){

        future=curnt.next;

        if(curnt.val< x)
        {

            if(itr==pre){
                itr=itr.next;
                pre=pre.next;
            }
            else{
                pre.next = future;
                curnt.next = itr.next;
                itr.next=curnt;
                itr=itr.next;
            }
            curnt = future;


        }
        else
        {
            pre=curnt;
            curnt= future;

        }
    }
    return dummy.next;
}
}
