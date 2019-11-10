package no24;

import java.util.Arrays;

/**
 * Created by bumblebee on 2019/11/10.
 * 给定一个数组，判断其是不是某个二叉搜索树后序遍历的结果
 */
public class No24 {

    public static void main(String[] args) {
        System.out.println(new No24().isPostOfBST(new int[]{5, 7, 6, 9, 11, 10, 8}, 7));
    }

    private boolean isPostOfBST(int[] sequence, int length) {
        if (sequence == null || length == 0) {
            return true;
        }

        int rootValue = sequence[length - 1];
        int leftIndex = 0;
        for (; leftIndex < length - 1; leftIndex ++) {
            if (sequence[leftIndex] > rootValue) {
                break;
            }
        }

        int rightIndex = leftIndex;
        for (; rightIndex < length - 1; rightIndex ++) {
            if (sequence[rightIndex] < rootValue) {
                return false;
            }
        }
        return isPostOfBST(sequence, leftIndex) && isPostOfBST(Arrays.copyOfRange(sequence, leftIndex, rightIndex), rightIndex - leftIndex);
    }
}
