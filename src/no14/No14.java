package no14;

import java.util.Arrays;

public class No14 {

    public static void main(String[] args) {
        int[] source = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(new No14().sortArray(source)));
    }

    private int[] sortArray(int[] source) {
        if (source == null || source.length <= 1) {
            return source;
        }

        int i = 0;
        int j = source.length - 1;

        while (i < j) {
            while (source[i] % 2 == 1) {
                i ++;
            }
            while (source[j] % 2 == 0) {
                j --;
            }

            if (i >= j) {
                break;
            }
            swap(source, i, j);
            i ++;
            j --;
        }
        return source;
    }

    private void swap(int[] source, int i, int j) {
        int temp = source[i];
        source[i] = source[j];
        source[j] = temp;
    }

    /*private int[] sortArray(int[] source) {
        if (source == null || source.length <= 1) {
            return source;
        }

        int[] result = new int[source.length];

        int i = 0;
        int j = result.length - 1;
        for (int value : source) {
            if (value % 2 == 1) {
                result[i ++] = value;
            } else {
                result[j --] = value;
            }
        }

        return result;
    }*/
}
