package src;

import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;

        int[][] result = new int[c][r];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
               result[j][i] = matrix[i][j];

            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] m = {{1,2,3},{4,5,6}};
        int[][] result = transpose(m);
        System.out.println(Arrays.deepToString(result));
    }
}
