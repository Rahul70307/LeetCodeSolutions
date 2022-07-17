package linkedlist;

import java.util.PriorityQueue;

public class MergeNSortedLL {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        PriorityQueue<ListNode> pq= new PriorityQueue<>((a, b)->{
            return a.val- b.val;
        });
        for (int i =0; i< lists.length; i++){
            if(lists[i]!=null){
                pq.add(lists[i]);
            }
        }
        while(pq.size()>0){
            ListNode remove =  pq.remove();
            pre.next = remove;
            pre= pre.next;
            if(remove.next!= null){
                pq.add(remove.next);
            }
        }
        pre.next = null;
        return dummy.next;

    }
}
