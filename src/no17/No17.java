package no17;

import data.ListNode;
import utils.LinkedListUtils;

/**
 * Created by bumblebee on 2019/11/8.
 * 合并两个有序链表
 */
public class No17 {

    public static void main(String[] args) {
        ListNode l1 = LinkedListUtils.createList(new int[]{1, 4, 5});
        ListNode l2 = LinkedListUtils.createList(new int[]{1, 2, 3});

        LinkedListUtils.printList(new No17().mergeTwoLists(l1, l2));
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        ListNode head = new ListNode(0);
        ListNode cur = head;

        while (true) {
            if (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    cur.next = l1;
                    l1 = l1.next;
                } else {
                    cur.next = l2;
                    l2 = l2.next;
                }
                cur = cur.next;
                continue;
            }

            if (l1 != null) {
                cur.next = l1;
                break;
            }
            cur.next = l2;
            break;
        }

        return head.next;
    }
}
