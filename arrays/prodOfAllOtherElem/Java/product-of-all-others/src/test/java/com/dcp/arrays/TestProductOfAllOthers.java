package com.dcp.arrays;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TestProductOfAllOthers {
    @Test
    public void testDevisionMethod() {
        int[] testArr = { 1, 2, 3, 4, 5 };
        int[] expectedOut = { 120, 60, 40, 30, 24 };
        int[] outArr = PorodOfNums.byDivision(testArr);
        assertArrayEquals(expectedOut, outArr);
    }

    @Test
    public void testWithoutDevisionMethod() {
        int[] testArr = { 1, 2, 3, 4, 5 };
        int[] expectedOut = { 120, 60, 40, 30, 24 };
        int[] outArr = PorodOfNums.noDivision(testArr);
        assertArrayEquals(expectedOut, outArr);
    }
    

}
