package com.klj.edu.debug;

public class debug01 {
    public static void main(String[] args) {
        //创建一个初始的变量 sum
        int sum = 0;
        for (int i = 1 ; i <=5 ; i++){
            //执行for循环
            sum += i;
            //每次循环都会让sum与i相加，并且每经过一次循环i都自加1
            System.out.println("i = "+i+"\nsum = "+sum);
        }
        System.out.println("循环结束");
    }
}
