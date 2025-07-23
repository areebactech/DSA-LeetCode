package src;

import java.util.Arrays;

public class Practice {
    /*public static int[] func(int[] nums){
        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;

    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        int[] result = func(nums);
        System.out.println(Arrays.toString(result));
    }
}*/
    public static int[] numIdenticalPairs(int[] nums) {

        int[] ans = new int[nums.length];

        for (int index = 0; index < nums.length; index++){
            int count = 0;
            for(int j = 0; j < nums.length; j++ ){
                if(nums[index] > nums[j]){
                    count++;
                }
            }
            ans[index] = count;
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums = {8,1,2,2,3};
        int[] result = numIdenticalPairs(nums);
        System.out.println(Arrays.toString(result));
    }
}