package com.dcp.arrays;

public class PorodOfNums {

    /**
     * @param testArr
     * @return
     */
    public static int[] byDivision(int[] testArr) {
        int[] outArr  = new int[testArr.length];
        int prodOfAll = 1;
        for(int i = 0 ;  i< testArr.length ; i++){
            prodOfAll = prodOfAll * testArr[i];
        }

        for(int i = 0 ;  i< testArr.length ; i++){
            outArr[i] = prodOfAll / testArr[i];
        }
        return outArr;
    }

}
