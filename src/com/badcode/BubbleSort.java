package com.badcode;

import java.util.Arrays;

/**
 * @author BadCode
 * @title: BubbleSort   冒泡排序
 * @date 2019/5/28  11:43
 */
public class BubbleSort {

    /**
     * 1.冒泡排序
     *  比较两个相邻的元素，如果第一个比第二个大，则把两个元素进行替换
     *  对每一对相邻元素重复进行替换，从开始到结束。
     *  对所有元素重复以上步骤，直至没有需要替换的元素为止
     * @param args
     */
    public static void main(String[] args) {

        //设置需要进行冒泡排序的数组
        int[] arr = {8,5,1,9,7,2,6,4,3};
        System.out.println("排序前:" + Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("排序后:" + Arrays.toString(arr));

    }
}
