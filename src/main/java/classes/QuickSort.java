/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author cauaa
 */
public class QuickSort {
   /**
    * int arr[] - array à ser ordenado
    * int b - elemento inicial do intervalo do array para ser ordenado
    * int n - elemento final do intervalo do array para ser ordenado
    * int k - método de escolha do pivot
    *   0: o primeiro elemento do vetor; 
    *   1: o ́ultimo elemento do vetor;
    *   2: o elemento do meio do vetor;
    *   3: mediana de trˆes elementos; e,
    *   4: uma posi ̧c ̃ao do vetor escolhida aleatoriamente.
    */
    public void ordenaQuickSort(int arr[], int b, int n, int k) {
        if(b < n){
            int pivot = k;
            int partitionIndex = partition(arr, b, n, k);

            this.ordenaQuickSort(arr, b, partitionIndex-1, k);
            this.ordenaQuickSort(arr, partitionIndex+1, n, k);
        }
        
    }
    
    private int partition(int arr[], int b, int n, int p) {
        int pivot = arr[p];
        int i = (b-1);

        for (int j = b; j < n; j++) {
            if (arr[j] <= pivot) {
                i++;

                int aux = arr[i];
                arr[i] = arr[j];
                arr[j] = aux;
            }
        }

        int aux = arr[i+1];
        arr[i+1] = arr[b];
        arr[b] = aux;

        return i+1;
    }

}
