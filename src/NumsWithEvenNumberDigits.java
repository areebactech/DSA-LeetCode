package src;

public class NumsWithEvenNumberDigits {
    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int digits = (num == 0)? 1 : (int)Math.log10(num) + 1;
            if (digits % 2 == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {12,345,22,6,7896};
        int result = findNumbers(nums);
        System.out.println(result);
    }
}
