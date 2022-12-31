
# Maximum Subarray Sum

**Subarrays** are arrays inside another array which only contains contiguous elements.

Given an array of integers, the task is to find the maximum subarray sum possible of all the non-empty subarrays.

## Simple Approach

A simple approach to this problem is the nested loop one, that is start with 0th index a and find all posible arrays and their sum starting with 0 Index, then move to indes 1 and so on 

## Kadane's Algo 

It is an iterative **Dynamic Programing** it involves calculation of local maxima and constantly comparing lgobal maxima with it and updating th global Maxima with local maxima.

> _Local maxima at index i is the maximum of the two : A[i] and the sum of A[i] and local minima at A[i-1]_

A simple Psuedo code will be as below:

If A is the input array:
> <P> 
    for i in 0 .. lenght(A)
        localMax = max(A[i],localMax)
        if(localMax > globalMax)
            globalMax = localMax;
</p>

> **Java code**
``` Java
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
```

