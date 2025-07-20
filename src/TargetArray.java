package src;
import java.util.*;

public class TargetArray {
    public static int[] createTargetArray(int[] nums, int[] index) {

        List<Integer> targetList = new ArrayList<>();
        for(int i = 0;i < nums.length;i++){
            targetList.add(index[i],nums[i]);
        }
        int[] target = new int[targetList.size()];
        for(int i = 0; i < targetList.size(); i++){
          target[i] =  targetList.get(i);
        }
        return target;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] result = createTargetArray(nums,index);
        System.out.println(Arrays.toString(result));

    }
}
