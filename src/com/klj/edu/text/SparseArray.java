package com.klj.edu.text;

import java.security.AllPermission;

public class SparseArray {

    @SuppressWarnings("all")
    public static void main(String[] args) {
        //原始的二维数组
        int chessArray[][] = new int[11][11];
        chessArray[1][2] = 1;
        chessArray[2][3] = 2;

        //遍历输出原始的二维数组
        System.out.println("==========原始数组==========");
        for (int[] row : chessArray) {
            for (int data : row) {
                System.out.printf("%d  ",data);
            }
            System.out.println();
        }

        //遍历原始二维数组得到有效数据个数
        int sum = 0;
        for (int i = 0 ; i < 11 ; i++) {
            for (int j = 0 ; j < 11 ; j++ ) {
                if (chessArray[i][j] != 0 ) {
                    sum++;
                }
            }
        }

        //创建稀疏数组并赋值
        int sparseArray[][] = new int[sum+1][3];
        sparseArray[0][0] = 11;
        sparseArray[0][1] = 11;
        sparseArray[0][2] = sum;

        int count = 0;
        for (int i = 0 ; i < 11 ; i++) {
            for (int j = 0 ; j < 11 ; j++ ) {
                if (chessArray[i][j] != 0 ) {
                    count ++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = chessArray[i][j];
                }
            }
        }
        //输出稀疏数组
        System.out.println("==========稀疏数组==========");
        for (int[] row : sparseArray) {
            for (int data : row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        //恢复二维数组
        System.out.println("==========恢复后的二维数组==========");
        int chessArray2[][] = new int[sparseArray[0][0]][sparseArray[0][1]];
        for (int i = 1 ; i < sparseArray.length ; i ++) {
            chessArray2[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }
        for (int[] row : chessArray2) {
            for (int data : row) {
                System.out.printf("%d  ",data);
            }
            System.out.println();
        }
    }
}
