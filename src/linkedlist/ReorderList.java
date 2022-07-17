//143. Reorder List  https://leetcode.com/problems/reorder-list/

package linkedlist;

public class ReorderList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static int size =0;
    public  static ListNode curnt ;

    public void reorderList(ListNode head) {
        curnt = head;
        size=0;
        reorderListRecursive(head, 0);

    } public static void reorderListRecursive( ListNode head, int floor){
        if( head == null){
            return;
        }
        size= size+1;
        reorderListRecursive(head.next, floor+1);
        if(floor>size/2){
            ListNode temp = curnt.next;
            head.next =temp;
            curnt.next = head;
            curnt= temp;
        }
        else if(floor==size/2){
            head.next= null;
        }


    }







}
