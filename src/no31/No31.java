package no31;

/**
 * @author Bumble Bee
 * @date 2019/11/11 3:59 下午
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 */
public class No31 {

    public static void main(String[] args) {
        System.out.println(new No31().maxSubArray(new int[]{/*-2,1,-3,4,-1,2,1,-5,4*/1,-2,0}));
    }
    public int maxSubArray(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int max = nums[0];
        int temp = nums[0];

        for (int i = 1; i < nums.length; i ++) {
            if (temp > 0) {
                temp += nums[i];
            } else {
                temp = nums[i];
            }
            max = Math.max(temp, max);
        }

        return max;
    }
}
