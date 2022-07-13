package linkedlist;

public class AddTwoNumber {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val1;
        int val2;

        int carry =0;
        ListNode nHead = new ListNode(0);
        ListNode curnt = nHead;
        while(l1!= null || l2!= null || carry !=0){
            if(l1!= null){
                val1 =l1.val;

            }else{
                val1 =0;
            }

            if(l2!= null){
                val2 =l2.val;

            }else{
                val2 =0;
            }
            int sum = carry+ val1 + val2;
            carry = sum/10;
            sum = sum%10;
            ListNode temp = new ListNode(sum);
            curnt.next = temp;
            curnt = curnt.next;
            if(l1!=null){
                l1= l1.next;

            }
            if(l2!= null){
                l2= l2.next;
            }
        }

        return nHead.next;
    }
}
