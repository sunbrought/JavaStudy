package com.java.sort;

import java.util.Arrays;


public class Soft {
    /**
     * 插入如排序
     */
    public static int[] insertSoft(int[] arr){
        long temp = 0;

        for(int i = 1; i < arr.length; i++){
            temp = arr[i];
            int j = i;

            while(j > 0 && arr[j] >= temp){
                arr[j] = arr[j-1];
                j--;
            }

            arr[j] = (int) temp;
        }

        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 7, -1};
        System.out.println(Arrays.toString(insertSoft(arr)));
    }
}
