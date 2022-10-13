package com.klj.util;

import java.util.Arrays;
@SuppressWarnings("all")
public class Range {

    /*
     *  此方法用于创建可设定起始值、终止值、步长值的一维数组。
     *  该方法可传入 1 ~ 3 个 int参数
     *  使用方法为 range(start, end , step)
     *  range(start,end) 此时步长值为1
     *  range(end) 此时起始值为0，步长值为1
     */
    public static int[] range(int start,int end, int step) {

        if (step == 0) {
            int[] range = new int[end];
            for (int i = 0; i < end; i++) {
                range[i] = start;
            }
            return range;
        }

        int size = Math.max(0, step >= 0 ? (end + step - 1 - start) / step : (end + step + 1 - start) / step);
        int[] range = new int[size];
        for (int i = 0; i < size; i++) {
            range[i] = start + i*step;
        }
        return range;
    }

    public static int[] range(int start,int end) {
        return range(start,end,1);
    }

    public static int[] range(int end) {
        return range(0,end,1);
    }

    public static void show(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}
