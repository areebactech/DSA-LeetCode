package src;
import java.util.Arrays;

public class ConcatenationofArrays {

    public static int[] getConcatenation(int[] nums) {

        int[] ans = new int[2 * nums.length];

        for (int i = 0; i < 2 * nums.length; i++) {

            ans[i] = nums[i % nums.length];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3};
        int[] result = getConcatenation(array);
        System.out.println(Arrays.toString(result));
    }
}
