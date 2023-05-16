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
public class QuickSort {
  
    private static Random random = new Random();
    
    private int acessos;
    
    private int comparacoes;
    
    private int pivots;
    
    private int trocas;
    
    /**
     * Funcão principal de ordenação, ela recebe os parametros
     *  e chama a função quicksort que age de maneira recusiva,
     *  além de armazenar e retornar as estatísticas de execução.
     * 
     * Recebe:
     * int[] arr - Array a ser ordenado.
     * int n - Número de elementos no vetor.
     * int m - A partir de qual tamanho de subarray devemos utilizar
     *  o método Insertion Sort ao invés do Quick Sort.
     * int k - Método de escolha do pivot:
     *   0 - Primeiro elemento.
     *   1 - Último elemento.
     *   2 - Elemento do meio.
     *   3 - Mediana de 3 elementos aleatórios.
     *   4 - Elemento aleatório.
     * 
     * Retorna:
     * double[] estats - Estatísticas sobre a execução do código,
     *  incluem, nessa ordem: Tempo de execução(ms), número de acessos ao array,
     *  número de comparações entre elementos do array, número de pivots escolhidos,
     *  número de trocas da posição de elementos do vetor.
    */
    public double[] ordenaQuickSort(int[] arr, int n, int m, int k){
        this.acessos = 0;
        this.comparacoes = 0;
        this.pivots = 0;
        this.trocas = 0;
        
        double startTime = System.nanoTime();
        
        this.quickSort(arr, 0, n-1, k, m);
        
        double estats[] = {System.nanoTime() - startTime, this.acessos, this.comparacoes, this.pivots, this.trocas};
        
        return estats;
    }
    
    /**
     * Função de ordenação pelo método Quick Sort, ela é chamada
     *  pela função anterior e utiliza da recursivade para ordenar o array.
     *  Separa o array principal em dois e chama a sí própria para ordená-lo.
     * 
     * Recebe:
     * int[] arr - Array a ser ordenado
     * int s - Posição inicial para ordenação.
     * int n - Posição final para ordenação.
     * int k - Método de escolha do pivot:
     *   0 - Primeiro elemento
     *   1 - Último elemento
     *   2 - Elemento do meio
     *   3 - Mediana de 3 elementos aleatórios
     *   4 - Elemento aleatório
     * int m - A partir de qual tamanho de subarray devemos utilizar
     *  o método Insertion Sort ao invés do Quick Sort.
    */
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
        this.pivots++;
        
        this.acessos++;
        int pivot = arr[pivotIndex];
        int i = s, j = n;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
                this.acessos++;
                this.comparacoes++;
            }

            while (arr[j] > pivot) {
                j--;
                this.acessos++;
                this.comparacoes++;
            }
            
            if (i <= j) {
                swap(arr, i, j);
                this.trocas++;
                i++;
                j--;
            }
        }
        quickSort(arr, s, j, k, m);
        quickSort(arr, i, n, k, m);
      }
    
    /**
     * Troca dois elementos do array posição.
     * 
     * Recebe:
     * int[] arr - Array a ser ordenado.
     * int i - Elemento 1.
     * int j - Elemento 2.
     * 
    */
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    /**
     * Escolha a mediana dentre 3 elementos inteiros.
     * 
     * Recebe:
     * int a - Elemento 1.
     * int b - Elemento 2.
     * int c - Elemento 3.
     * 
     * Retorna:
     *  Retorna o inteiro que for a mediana.
    */
    private int medianaTresValores(int a, int b, int c){
        if((a <= b && a >= c) || (a >= b && a <= c )){
            return a;
        }else if((b <= a && b >= c) || ( b >= a && b <= c)){
            return b;
        }
        return c;
    }
    
    /**
     * Ordena um subarray pelo método de Insertion Sort.
     * 
     * Recebe:
     * int[] arr - Array a ser ordena.
     * int s - Primeiro elemento do subarray a ser ordenado.
     * int n - Último elemento do subarray a ser ordenado.
    */
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
