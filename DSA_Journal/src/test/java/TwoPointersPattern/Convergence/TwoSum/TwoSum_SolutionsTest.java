package TwoPointersPattern.Convergence.TwoSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSum_SolutionsTest {

    @Test
    void numsShouldEqual_1(){
        int[] shouldEqual = new int[] {0,1};
        int[] res = TwoSum_Solutions.twoSum(new int[] {2,7,11,15},9);
        assertArrayEquals(shouldEqual,res);
    }

    @Test
    void numsShouldEqual_2(){
        int[] shouldEqual = new int[] {1,2};
        int[] res = TwoSum_Solutions.twoSum(new int[] {3,2,4},6);
        assertArrayEquals(shouldEqual,res);
    }

    @Test
    void numsShouldEqual_3(){
        int[] shouldEqual = new int[] {0,1};
        int[] res = TwoSum_Solutions.twoSum(new int[] {3,3},6);
        assertArrayEquals(shouldEqual,res);
    }


}