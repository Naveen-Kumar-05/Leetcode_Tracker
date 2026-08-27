// Last updated: 27/8/2026, 9:58:18 am
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        
        while (curr.next != null && curr.next.next != null) {
            ListNode first = curr.next;
            ListNode second = curr.next.next;
            curr.next = second;
            first.next = second.next;
            second.next = first;
            curr = curr.next.next;
        }
        
        return dummy.next;
    }
}