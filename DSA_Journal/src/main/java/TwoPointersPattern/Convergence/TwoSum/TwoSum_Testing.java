package TwoPointersPattern.Convergence.TwoSum;

import java.util.Arrays;

import static TwoPointersPattern.Convergence.TwoSum.TwoSum_Solutions.twoSum;

public class TwoSum_Testing {
    static void main(String[] args) {
        /*
         * Input: nums = [2,7,11,15], target = 9
         * Output: [0,1]
         * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
         *
         */

//        int[] nums = new int[] {2,7,11,15};
//        int target = 9;
//        int[] res = twoSum(nums,9);
//        System.out.println(Arrays.toString(res));


        /**
         * Example 2:
         *
         * Input: nums = [3,2,4], target = 6
         * Output: [1,2]
         */

        int[] nums = new int[] {3,2,4};
        int target = 6;
        int[] res = twoSum(nums,target);
        System.out.println(Arrays.toString(res));

    }

}
