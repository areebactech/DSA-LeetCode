package src;

public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {

        int sum = 0;
        int start = 0;
        int end = mat.length - 1;

        for (int i = 0; i < mat.length; i++) {
            if(start == end) sum -= mat[i][start];
            sum += mat[i][start] + mat[i][end];
            start++;
            end--;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
        int result = diagonalSum(mat);
        System.out.println(result);
    }
    }
