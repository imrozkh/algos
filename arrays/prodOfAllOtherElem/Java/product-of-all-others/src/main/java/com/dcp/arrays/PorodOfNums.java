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

    public static int[] noDivision(int[] testArr) {
        int[] outarr = new int[testArr.length];
        int[] prefArr = getPrefixProductArray(testArr);
        int[] sufArr = getSuffixProductArray(testArr);
        for(int i=0; i< testArr.length ; i++) {
            if(i==0){
                outarr[i] = sufArr[i+1];
            }else if(i == testArr.length -1){
                outarr[i] = prefArr[i-1];
            }
            else{
                outarr[i] = prefArr[i-1] * sufArr[i+1];
            }
        }

        return outarr;
    }

    public static int[] getPrefixProductArray (int [] inArr){
        int[] prefProdArrr = new int[inArr.length];
        for( int i=0; i< inArr.length;i++){
            if(i==0) { // first element should go as is 
                prefProdArrr[i] = inArr[i];
            }
            else{
                prefProdArrr[i] = prefProdArrr[i-1] * inArr[i];
            }
        }

        return prefProdArrr;
    }

    public static int[] getSuffixProductArray(int[] testArr) {
        int[] suffixProdArr = new int[testArr.length];
        for(int i=  testArr.length - 1; i>=0 ; i-- ){
            if( i == testArr.length-1){
                suffixProdArr[i] = testArr[i];
            }else{
                suffixProdArr[i] = suffixProdArr[i+1] * testArr[i];
            }
        }
        return suffixProdArr;
    }

}
