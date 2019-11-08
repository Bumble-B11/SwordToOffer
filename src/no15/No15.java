package no15;

import data.ListNode;
import utils.LinkedListUtils;

/**
 * Created by bumblebee on 2019/11/8.
 */
public class No15 {
    public static void main(String[] args) {
        ListNode head = LinkedListUtils.createList(new int[]{1, 2, 3, 4, 5, 7});
        System.out.println(new No15().getLastKToTail(head, 6).val);
    }

    private ListNode getLastKToTail(ListNode head, int k) {
        if (head == null || k <= 0) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (k > 1 && fast != null) {
            fast = fast.next;
            k --;
        }

        if (fast == null) {
            return null;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}
