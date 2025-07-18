package src;

import java.util.Arrays;

public class Build_Array_from_Permutation {

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
     int[] array = {0,2,1,5,3,4};
     int[] result = buildArray(array);
        System.out.println(Arrays.toString(result));
    }
}
