package com.dcp.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestKadanesAlgo {
    
    @Test
    public void testKadanesAlgo(){
        int[] inArr = {1,2,3,-2,5};
        int out = KadanesAlgo.solve(inArr);
        assertEquals(9, out);
    }
}
