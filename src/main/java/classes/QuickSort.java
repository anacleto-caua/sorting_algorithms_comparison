/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Random;

/**
 *
 * @author cauaa
 */
   /**
    * int arr[] - array à ser ordenado
    * int s - elemento inicial do intervalo do array para ser ordenado
    * int n - elemento final do intervalo do array para ser ordenado
    * int k - método de escolha do pivot
    *   0: o primeiro elemento do vetor; 
    *   1: o ́ultimo elemento do vetor;
    *   2: o elemento do meio do vetor;
    *   3: mediana de trˆes elementos; e,
    *   4: uma posi ̧c ̃ao do vetor escolhida aleatoriamente.
    */
public class QuickSort {
  
    private static Random random = new Random();

    public void ordenaQuickSort(int[] arr, int n, int m, int k){
        this.quickSort(arr, 0, n-1, k, m);
    }
    
    public void quickSort(int[] arr, int s, int n, int k, int m) {
        if (s >= n) {
          return;
        }
        
        if(n-s <= m){
            this.insertionSort(arr, s, n);
            return;
        }
        
        int pivotIndex = 0;
        switch(k){
            case 0:
                pivotIndex = s;
                break;
            case 1:
                pivotIndex = n;
                break;
            case 2:
                pivotIndex = ((n-s)/2)+s;
                break;
            case 3:
                pivotIndex = medianaTresValores(random.nextInt(n-s) + s, random.nextInt(n-s) + s, random.nextInt(n-s) + s);
                break;
            case 4:
                pivotIndex = random.nextInt(n-s) + s;
                break;
        }
        
        int pivot = arr[pivotIndex];
        int i = s, j = n;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        quickSort(arr, s, j, k, m);
        quickSort(arr, i, n, k, m);
      }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    private int medianaTresValores(int a, int b, int c){
        if((a <= b && a >= c) || (a >= b && a <= c )){
            return a;
        }else if((b <= a && b >= c) || ( b >= a && b <= c)){
            return b;
        }
        return c;
    }
    
    public static void insertionSort(int[] arr, int s, int n) {
        if (arr == null || arr.length == 0 || s >= n || s < 0 || n >= arr.length) {
            return;
        }

        for (int i = s + 1; i <= n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= s && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}
