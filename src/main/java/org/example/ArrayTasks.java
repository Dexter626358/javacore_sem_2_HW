package org.example;

import com.sun.source.tree.BreakTree;

/*
Написать метод, возвращающий количество чётных элементов массива.
countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.
Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.c
 */
public class ArrayTasks {

    public static int countEvens(int[] array){
        int countNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                countNum++;
            }
        }
        return countNum;
    }

    public static int diffMinMax(int[] array){
        int diff;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
        }
        diff = max - min;
        return diff;
    }

    public static boolean TwoZeros(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0 && array[i+1] == 0){
                return true;
            }
        }
        return false;
    }




}
