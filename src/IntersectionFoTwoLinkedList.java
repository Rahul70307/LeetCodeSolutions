public class IntersectionFoTwoLinkedList {
    /**
     * Brute Force Solution
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
     public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
          }
      }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode intersectionNode= headA;
        ListNode currentNode= headB;
        while(intersectionNode!=null){
            currentNode= headB;
            while(currentNode!=null){
                if(currentNode!=intersectionNode){
                    currentNode=currentNode.next;
                }else{
                    return intersectionNode;
                }
            }
            intersectionNode=intersectionNode.next;
        }
        return null;
    }
}
