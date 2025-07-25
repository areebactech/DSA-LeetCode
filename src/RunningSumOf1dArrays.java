package src;
import java.util.Arrays;

public class RunningSumOf1dArrays{

    public static int[] runningSum(int[] nums) {

        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i - 1];
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] result = runningSum(array);
        System.out.println(Arrays.toString(result));
    }
}