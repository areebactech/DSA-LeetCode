package src;

import java.util.Arrays;

public class FlippingImage {

    public static int[][] flipAndInvertImage(int[][] image) {

        for (int[] i : image) {
            int left = 0;
            int right = image.length - 1;

            while (left <= right) {

                int temp = i[left] ^ 1;
                i[left] = i[right] ^ 1;
                i[right] = temp;

                left++;
                right--;

            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        int[][] result = flipAndInvertImage(image);
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
