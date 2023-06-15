package org.example;

public class zad2 {
    public static void main(String[] args) {
            //2) Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
        int [] arr = {0,3,4,5,6,7,8,9,10};
        boolean z = false;
        for (int i =1; i<arr.length; i++){
            if (arr[i-1]>arr[i]) z=true;
        }
        if (z==true) System.out.println("Убывающая");
        else System.out.println("Возрастающая");
    }
}
