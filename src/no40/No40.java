package no40;

/**
 * Created by bumblebee on 2019/11/13.
 * 找出那个只出现了一次的元素
 */
public class No40 {

    public static void main(String[] args) {
        System.out.println(new No40().singleNumber(new int[]{4,1,2,1,2}));
    }

    public int singleNumber(int[] nums) {

        if (nums == null) {
            return 0;
        }
        int result = 0;
        for (int i : nums) {
            result ^= i;
        }

        return result;
    }
}
