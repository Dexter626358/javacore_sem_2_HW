package org.example;

public class Main {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array1 = {0, 1, 2, 0, 0, 5, 6, 7, 8, 9, 10};
        int[] array3 = {0, 1, 2, 0, 4, 5, 0, 7, 8, 9, 10};
        System.out.print("Количество четных чисел составляет: ");
        System.out.println(ArrayTasks.countEvens(array));
        System.out.print("Разница между максимальным и минимальным элементом массива составляет: ");
        System.out.println(ArrayTasks.diffMinMax(array));
        System.out.println(ArrayTasks.TwoZeros(array));
        System.out.println(ArrayTasks.TwoZeros(array1));
        System.out.println(ArrayTasks.TwoZeros(array3));

    }
}