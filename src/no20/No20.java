package no20;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bumblebee on 2019/11/9.
 * 给定一个包含 m x n 个元素的矩阵（m 行, n 列），
 * 请按照顺时针螺旋顺序，返回矩阵中的所有元素。
 */
public class No20 {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1, 2, 3, 10},
                {4, 5, 6, 11},
                {7, 8, 9, 12},
        };

        System.out.println(new No20().spiralOrder(array).toString());
    }

    public List<Integer> spiralOrder(int[][] matrix) {

        if (matrix == null) {
            return null;
        }

        if (matrix.length <= 0 || matrix[0].length <= 0) {
            return new ArrayList<>();
        }

        List<Integer> results = new ArrayList<>(matrix.length * matrix[0].length);

        int xPrintTimes = (matrix[0].length + 1) / 2;
        int yPrintTimes = (matrix.length + 1) / 2;
        int startX, startY, endX, endY;

        int printTimes = Math.min(xPrintTimes, yPrintTimes);

        for (int i = 0; i < printTimes; i ++) {
            int x = i, y = i;
            endX = matrix[0].length - i - 1;

            for (; x <= endX; x ++) {
                results.add(matrix[y][x]);
            }

            startX = matrix[0].length - i - 1;
//            endX = matrix[0].length - i - 1;
            startY = i + 1;
            endY = matrix.length - i - 1;

            if (startY > endY) {
                continue;
            }

            for (x = startX, y = startY; y <= endY; y ++) {
                results.add(matrix[y][x]);
            }

            startX = matrix[0].length - i - 2;
            endX = i;
            startY = matrix.length - i - 1;
//            endY = matrix.length - i - 1;

            if (startX < endX) {
                continue;
            }

            for (y = startY, x = startX; x >= i; x --) {
                results.add(matrix[y][x]);
            }

            startX = i;
//            endX = i;
            startY = matrix.length - i - 2;
            endY = i + 1;

            if (endY > startY) {
                continue;
            }
            for (x = startX, y = startY; y > i; y --) {
                results.add(matrix[y][x]);
            }
        }

        return results;
    }
}
