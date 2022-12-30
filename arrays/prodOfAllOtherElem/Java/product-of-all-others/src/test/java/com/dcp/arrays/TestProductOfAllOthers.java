package com.dcp.arrays;

import static org.junit.Assert.assertArrayEquals;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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

    @Test
    public void testPrefixProdArray() {
        int [] outarr = null;
        int[] testArr     = { 1, 2, 3, 4};
        int[] expectedArr = { 1, 2, 6, 24};
        outarr = PorodOfNums.getPrefixProductArray(testArr);
        assertArrayEquals(expectedArr, outarr);
    }

    @Test
    public void testSufixProdArray() {
        int [] outarr = null;
        int[] testArr     = { 1, 2, 3, 4};
        int[] expectedArr = { 24, 24, 12, 4};
        outarr = PorodOfNums.getSuffixProductArray(testArr);
        assertArrayEquals(expectedArr, outarr);
    }

}
