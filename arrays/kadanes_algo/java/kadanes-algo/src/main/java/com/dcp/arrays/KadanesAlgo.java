package com.dcp.arrays;

public class KadanesAlgo {

    public static int solve(int[] inArr) {
        int globalMax = Integer.MIN_VALUE;
        int localMax = Integer.MIN_VALUE;
        for (int i = 0; i < inArr.length; i++) {
            localMax = Math.max(inArr[i], localMax + inArr[i]);
            globalMax = (globalMax > localMax) ? globalMax : localMax;
        }
        return globalMax;
    }

}
