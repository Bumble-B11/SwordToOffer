package no3;

/**
 * @author Bumble Bee
 * @date 2019/11/14 6:35 下午
 * 搜索 m x n 矩阵 matrix 中的一个目标值
 */
public class No3 {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        System.out.println(new No3().searchMatrix(matrix, 20));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null) {
            return false;
        }

        int row = matrix.length;
        if (row <= 0) {
            return false;
        }
        int column = matrix[0].length;
        if (column <= 0) {
            return false;
        }

        int rowIndex = 0;
        int columnIndex = column - 1;
        while (columnIndex >= 0 && rowIndex < row) {
            int current = matrix[rowIndex][columnIndex];
            if (current > target) {
                columnIndex --;
            } else if (current < target) {
                rowIndex ++;
            } else {
                return true;
            }
        }

        return false;
    }
}
