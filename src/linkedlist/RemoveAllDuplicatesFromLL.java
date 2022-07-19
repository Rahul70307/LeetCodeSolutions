//82. Remove Duplicates from Sorted List II

//https://leetcode.com/submissions/detail/747632027//



package linkedlist;

public class RemoveAllDuplicatesFromLL {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
    if( head== null || head.next == null){
        return head;
    }

    ListNode dummy = new ListNode (-1);
    ListNode unique = dummy;
    ListNode curnt = head.next;
    unique.next =head;

    while(curnt!= null){
        boolean isDuplicateExists = false;
        while(curnt != null && unique.next.val == curnt.val){
            isDuplicateExists= true;
            curnt= curnt.next;

        }


        if(isDuplicateExists){
            unique.next = curnt;
        }
        else{
            unique =unique.next;

        }

        if( curnt != null){
            curnt = curnt.next;
        }

    }
    return dummy.next;


}



}
