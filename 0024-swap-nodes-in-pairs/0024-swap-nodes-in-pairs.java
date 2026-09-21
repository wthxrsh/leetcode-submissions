class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            ListNode first  = prev.next;       // 1
            ListNode second = prev.next.next;  // 2

            first.next  = second.next;  // 1 -> 3
            second.next = first;        // 2 -> 1
            prev.next   = second;       // prev -> 2

            prev = first;               // step forward by two
        }
        return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna