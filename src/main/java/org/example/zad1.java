package org.example;

public class zad1 {
    public static void main(String[] args) {
        //1) Дана последовательность N целых чисел. Найти сумму простых чисел.
        int[] arr = {2,3,4,1,6,16,0,121,5};
        int sum = 0;
        for (int i = 0; i<arr.length; i++){
           if (arr[i]==1) sum+=0;
           else if (arr[i]==2 | arr[i]==3) sum+=arr[i];
           else for (int j = 2; j <arr[i]; j++){
                if (arr[i]%j==0){
                    break;
                }
                else {
                    sum+=arr[i];
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
