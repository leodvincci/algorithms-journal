package TwoPointersPattern.SlidingWindow.MaxSum3;

//Find max sum of 3 consecutive elements
public class MaxSum3 {


    public int maxSum(int[] arr, int k){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        //Get initial window
        for(int i = 0; i < k; i++){ // stop at kth value
                sum+=arr[i];
        }

        max = sum;
        int left = 0;
        int right = k;
        while(right < arr.length){
            sum -= arr[left];
            sum += arr[right];
            left++;
            right++;
            max = Math.max(sum,max);
        }
        return max;
    }



    /*
            //    public static int returnMax3(int[] nums ,int k) {
//        int max = Integer.MIN_VALUE;
//        int sum = 0;
//
//        for(int i = 0; i < k; i++){
//            sum+= nums[i];
//            System.out.println(nums[i]);
//        }
//
//        max = sum;
//        System.out.println("Init Sum: " + sum);
//
//        for(int i = 0; i < nums.length-k; i++){
//            sum -= nums[i];
//            sum += nums[i+k];
//            System.out.println("New Sum: " + sum);
//            max = Math.max(sum,max);
//        }
//        System.out.println();
//
//        return max;
//    }

//    public static int returnMax2(int[] nums ,int k) {
//        int max = Integer.MIN_VALUE;
//        int sum = 0;
//
//
//        for(int i = 0; i < k ;i++){
//            sum += nums[i];
//        }
//
//        max = sum;
//
//        System.out.println("init sum: " + sum);
//        System.out.println("init max: " + max);
//        System.out.println();
//
//        int left = 1;
//        int right = left +k;
//
//        while (left <= nums.length - k){
//            sum -= nums[left-1];
//            sum+= nums[right-1];
//            left++;
//            right++;
//
//            if(sum > max){
//                max = sum;
//            }
//            System.out.println("Cur Max: " + max);
//            System.out.println("Cur sum: "  + sum);
//
//        }
//
//        return max;
//    }

//    public static int returnMax(int[] nums ,int k) {
//        int max = Integer.MIN_VALUE;
//        int sum;
//
//        for(int i = 0; i < nums.length-k; i++){
//            sum = 0;
//            for(int j = i; j< i+k;j++){
//                sum+= nums[j];
//            }
//            System.out.println(sum);
//            if(sum > max){
//                max = sum;
//            }
//        }
//        return max;
//    }
     */


}
