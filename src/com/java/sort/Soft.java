package com.java.sort;

import java.util.Arrays;


public class Soft {
    /**
     * 插入排序(因为需要有插入值的位置所以下标必须从1开始遍历，循环后，在已排序序列中从后向前扫描，找到相应的位置并插入。)
     */
    public static int[] insertSoft(int[] arr){
        //需要插入的值
        long temp = 0;

        //从数组的第二个元素开始循环将数组中的元素插入
        for(int i = 1; i < arr.length; i++){
            temp = arr[i];
            //插入点的下标
            int j = i;
            //如果要播入的元素小于第j-1个元素,就将第j-1个元素向后移动
            while(j > 0 && temp < arr[j - 1]){
                arr[j] = arr[j-1];
                j--;
            }
            //直到要插入的元素不小于第j-1个元素,将temp插入到数组中
            arr[j] = (int) temp;
        }

        return arr;
    }
    /**
     * 选择排序(每趟找最小数的下标，之后将定位的最小的值放入首位，因为首位每次都假设为最小值)
     */
    public static int[] choosetSoft(int[] arr){
        //最小的值的下标
        int k = 0;
        long temp = 0;

        for(int i = 0; i < arr.length - 1; i++){
            k = i;

            for(int j = i; j < arr.length; j++){
                if(arr[j] < arr[k]){
                    k = j;
                }
            }

            temp = arr[i];
            arr[i] = arr[k];
            arr[k] = (int) temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 7, -1};
        System.out.println(Arrays.toString(insertSoft(arr)));
//        System.out.println(Arrays.toString(choosetSoft(arr)));
    }
}
