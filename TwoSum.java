package LeetCode.LeetCode;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {5,7,20,15};
        int[] result = twoSum(nums, 12);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int i = 0;
        int j = 1;
        while (i < nums.length){
            if (nums[i] + nums[j] == target){
                result[0] = i;
                result[1] = j;
                break;
            }
            j++;
            if (j == nums.length){
                i++;
                j = i + 1;
            }
        }
        return result;
    }
    
}
