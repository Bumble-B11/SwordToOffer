package no29;

import java.util.Arrays;

/**
 * @author Bumble Bee
 * @date 2019/11/11 12:41 下午
 * 找出一个数组中出现次数超过一半的数字
 */
public class No29 {

    public static void main(String[] args) {
        System.out.println(new No29().majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
    /*public int majorityElement(int[] nums) {
        if (nums == null) {
            return 0;
        }

        Arrays.sort(nums);
        return nums[nums.length / 2];
    }*/
    public int majorityElement(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int times = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i ++) {
            if (times == 0) {
                result = nums[i];
                times = 1;
            } else {
                if (result == nums[i]) {
                    times ++;
                } else {
                    times --;
                }
            }
        }
        return result;
    }
}
