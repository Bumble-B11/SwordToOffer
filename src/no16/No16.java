package no16;

import data.ListNode;
import utils.LinkedListUtils;

/**
 * Created by bumblebee on 2019/11/8.
 * 反转一个单链表
 */
public class No16 {

    public static void main(String[] args) {
        ListNode head = LinkedListUtils.createList(new int[]{1, 2, 3, 4, 5});

        LinkedListUtils.printList(new No16().reverseLinkerList(head));
    }

    private ListNode reverseLinkerList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode pre = null, next;

        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return pre;
    }
}
