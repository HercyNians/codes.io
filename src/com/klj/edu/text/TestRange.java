package com.klj.edu.text;

import static com.klj.util.Range.*;

public class TestRange {
    public static void main(String[] args) {
        int[] arr1 = range(10);
        int[] arr2 = range(10,-10,-2);
        show(arr1);
        show(arr2);
        for (int i : range(2,9,3)) {
            System.out.printf("%d  ",i);
        }
        show(range(10,5,0));
    }


}
