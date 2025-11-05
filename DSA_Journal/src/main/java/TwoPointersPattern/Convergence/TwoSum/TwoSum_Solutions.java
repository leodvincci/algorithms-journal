package TwoPointersPattern.Convergence.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_Solutions {

    public static int[] twoSum(int[] nums, int target){
        /***
         * U.M.P.I.R.E
         *
         * Understand the problem*
         * the problem is asking me to find which number in the array add up to the target.
         * for example [2,7,11,15] return the index in an array that adds up to target => 9
         * 7+2 = 9 => return {0 ,1 }
         *
         * Match
         * I could use a hashmap to keep track of which number I've already looked at.
         *The target 9 I need to find its complimentary such that 9 - i = j; j + i = 9;
         * for example 9 - 2 = 7... so I need to see if I've seen a 7 already by checking hashmap
         * if i have return it's index and the current index in an array.
         *
         * PsydoCode
         *
         * hashMap<int, int>
         *     for(int i = 0; i < nums.length; i++){
         *          if(abs( nums[i] - 9 ) is in the hashmap): <---this checks if the number I need
         *                      ---is in the map already
         *              return {the index, i}
         *           else{
         *              hashmap.put(nums[i],i) <---this adds it to the hashmap so that I can pull the
         *              index when I need to.
         *           }
         *     }
         *
         * ******* Implement *****
         *
         *
         * ****REVIEW***
         */

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){ //this line iterates through array
            int searchKey = Math.abs( nums[i] - target ); //grabs the search key (current number in array) i need such that 9 - i--example 9-2 = 7
            if( hashMap.containsKey( searchKey ) ){ // if 9 - i is in map (7), that means i(7) + searchkey(2) =9
                return new int[] {hashMap.get(searchKey),i}; // return the index array
            }else {
                hashMap.put(nums[i],i); //otherwise put in map. //make sure to put the num in there..not the searchKey
            }
        }
        return new int[] {}; //if nothing is found return empty array.
    }


}
