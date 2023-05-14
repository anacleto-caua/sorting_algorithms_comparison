/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sortingalgorithms;

import java.util.Random;

/**
 *
 * @author cauaa
 */
public class SortingAlgorithms {
    
    //gera um vetor de 300.000 posicoes
    public static void geraVetor(int[] vetor)
    {
        Random r = new Random();
        
        
        for(int i = 0; i < vetor.length; i++)
        {
            //gera valores aleatorios entre 1 e o tamanho do vetor, que no caso é 300000
            vetor[i] = r.nextInt(vetor.length) + 1;
        }
    }
    
    //imprime o vetor
    public static void imprimeVetor(int vetor[], int n)
    {
        for(int i = 0; i < n; i++)
        {
            System.out.print(vetor[i] + ", ");
        }
    }
    
    public static void main(String[] args) {
        
        int[] vetor = new int[30];
        
//       for(int i = 0; i < 11; i++)
//       {
//           
//       }

        geraVetor(vetor);

        imprimeVetor(vetor, 30);
        System.out.println();
        imprimeVetor(vetor, 10);
        System.out.println();
        imprimeVetor(vetor, 20);

    }
}
