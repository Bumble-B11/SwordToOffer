package no38;

/**
 * Created by bumblebee on 2019/11/12.
 * 求一个数字在排序数组中出现的次数
 */
public class No38 {

    public static void main(String[] args) {
        System.out.println(new No38().getNumberOfK(new int[]{1, 2, 2, 3, 3, 3, 3, 3, 4, 5}, 0));
    }

    private int getNumberOfK(int[] array, int k) {
        if (array == null || array.length == 0) {
            return -1;
        }

        if (k < array[0] || k > array[array.length - 1]) {
            return -1;
        }

        int first = getFirstK(array, k);
        if (first == -1) {
            return -1;
        }

        int last = getLastK(array, k);
        if (last == -1) {
            return -1;
        }

        return last - first + 1;
    }

    private int getFirstK(int[] array, int k) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int i = 0;
        int j = array.length - 1;
        int middle;
        while (i < j) {
            middle = (i + j) / 2;
            if (array[middle] == k) {
                if (middle == 0 || array[middle - 1] != k) {
                    return middle;
                }
                j = middle - 1;
            } else if (array[middle] < k) {
                i = middle + 1;
            } else {
                j = middle - 1;
            }
        }
        middle = (i + j) / 2;
        if (array[middle] == k) {
            return middle;
        }
        return -1;
    }

    private int getLastK(int[] array, int k) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int i = 0;
        int j = array.length - 1;
        int middle;

        while (i < j) {
            middle = (i + j) / 2;
            if (array[middle] == k) {
                if (middle == array.length - 1 || array[middle + 1] != k) {
                    return middle;
                }
                i = middle + 1;
            } else if (array[middle] < k) {
                i = middle + 1;
            } else {
                j = middle - 1;
            }
        }
        middle = (i + j) / 2;
        if (array[middle] == k) {
            return middle;
        }
        return -1;
    }
}
