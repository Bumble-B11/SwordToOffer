package no41;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by bumblebee on 2019/11/14.
 * 输入一个正数序列s，打印所有和为k的连续子序列
 */
public class No41 {

    public static void main(String[] args) {
        List<List<Integer>> lists = new No41().getSequenceOfK(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 15);
        for (List<Integer> list : lists) {
            System.out.println(list.toString());
        }
    }

    private List<List<Integer>> getSequenceOfK(int[] array, int k) {
        if (array == null || array.length == 0) {
            return null;
        }
        int sum = 0;
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> temp = new LinkedList<>();

        int i = 0;
        while (i < array.length) {
            if (sum < k) {
                sum += array[i];
                temp.offer(array[i]);
                i ++;
            } else if (sum > k) {
                sum -= temp.poll();
            } else {
                List<Integer> list = new ArrayList<>(temp);
                result.add(list);
                sum -= temp.poll();
            }
        }

        while (!temp.isEmpty() && sum >= k) {
            if (sum == k) {
                List<Integer> list = new ArrayList<>(temp);
                result.add(list);
                break;
            }
            sum -= temp.poll();
        }

        return result;
    }
}
