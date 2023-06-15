package org.example;

import java.util.Arrays;

public class zad3 {
    public static void main(String[] args) {
        /*3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
                Пример:
        Массив = {1, 22, 33, 44, 5, -5, -3, 23, 17}
        Сумма индексов двузначных элементов массива = 1+2+3+7 = 13
        Массив после замены отрицательных на сумму = {1, 22, 33, 44, 5, 13, 13, 23, 13} */
        int[] arr = {1, 22, 33, 44, 5, -5, -3, -23, 2};
        int sum = 0;
        for (int i = 0; i<arr.length;i++){
            if ((arr[i]>10 & arr[i]<99) | arr[i]<-10 & arr[i]>-99) sum+=i;
        }
        for (int i = 0; i<arr.length;i++){
            if (arr[i]<0) arr[i]=sum;
        }
        System.out.println("Сумма индексов двузначных элементов массива = " + sum);
        for(int a : arr) System.out.print(a +" ");
    }
}
