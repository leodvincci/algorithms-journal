package TwoPointersPattern.SlidingWindow.MaxSum3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MaxSum3Test {

    @Test
    public void maxSum(){
        MaxSum3 MaxSum = new MaxSum3();
        int res = MaxSum.maxSum(new int[] {1, 3, 2, 5, 1, 1, 2, 3, 4},3);
        assertEquals(10, res);
    }

}