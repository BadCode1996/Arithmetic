package com.badcode;

import java.util.Arrays;

/**
 * @author BadCode
 * @title: SelectSort   选择排序
 * @projectName Arithmetic
 * @date 2019/5/28  13:22
 */
public class SelectSort {

    /**
     * 2.选择排序
     *  在没有进行排序的数组中，找出最小的元素，把它放在已排序数组的起始位置。
     *  再从剩下的元素中找出最小的元素，把它放在已排序数组的末尾位置。
     *  重复以上步骤，直至全部排序结束。
     * @param args
     */
    public static void main(String[] args) {

        //设置需要进行选择排序的数组
        int[] arr = {8,5,1,9,7,2,6,4,3};
        System.out.println("排序前:" + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            //设置最小值
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                //通过循环获取最小值
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            if (i != min){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        System.out.println("排序后:" + Arrays.toString(arr));
    }
}
