package no13;

import data.ListNode;
import utils.LinkedListUtils;

public class No13 {

    public static void main(String[] args) {
        ListNode head = LinkedListUtils.createList(new int[]{1, 2, 3, 5, 6, 9});
        ListNode target = LinkedListUtils.getNodeByVal(head, 6);
        LinkedListUtils.printList(new No13().deleteNode(head, target));
    }

    private ListNode deleteNode(ListNode head, ListNode target) {
        if (head == null || target == null) {
            return null;
        }

        if (head.next == null) {
            return null;
        }

        if (target == head) {
            ListNode newHead = head;
            head = head.next;
            newHead.next = null;
            return head;
        }

        if (target.next == null) {
            ListNode cur = head;
            while (cur.next.val != target.val) {
                cur = cur.next;
            }
            cur.next = null;
            return head;
        }

        ListNode next = target.next;
        target.val = next.val;
        target.next = next.next;
        return head;
    }
}
