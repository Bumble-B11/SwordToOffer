package no30;

import java.util.Arrays;

/**
 * @author Bumble Bee
 * @date 2019/11/11 1:06 下午
 * 最小的k个数
 */
public class No30 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new No30().getTopK(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 4)));
    }

    private int[] getTopK(int[] nums, int k) {
        if (k <= 0) {
            return nums;
        }
        if (nums == null || nums.length < k) {
            return nums;
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i ++) {
            result[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] < result[k - 1]) {
                insertNum(result, nums[i]);
            }
        }

        return result;
    }

    private void insertNum(int[] array, int num) {
        int insertIndex = array.length;
        for (int i = 0; i < array.length; i ++) {
            if (num > array[i]) {
                continue;
            }
            insertIndex = i;
            break;
        }
        for (int i = array.length - 2; i > insertIndex; i --) {
            array[i + 1] = array[i];
        }

        array[insertIndex] = num;
    }
}
