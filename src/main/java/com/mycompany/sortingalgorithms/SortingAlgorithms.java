/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sortingalgorithms;

import classes.QuickSort;
import java.util.Random;
//BOLSONARO
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
            vetor[i] = r.nextInt(1000) + 1;
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
    
    public static void particionaVetor(int[] vetor, int[] particao, int tam)
    {
        for(int i = 0; i < tam; i++)
        {
            particao[i] = vetor[i];
        }
    }
    
    public static void main(String[] args) {
        
        int[] vetor = new int[30000];
        
        QuickSort qs = new QuickSort();
        
        //roda 100x para calcular as medias
       for(int i = 0; i < 100; i++)
       {
           geraVetor(vetor);
           
           //passa pelas 11 opções de tamanho do vetor
           for(int j = 0; j < 11; j++)
           {
               switch(j)
               {
                   //vetor de 500
                   case 0:
                       int [] v500 = new int[500];
                       particionaVetor(vetor, v500, v500.length);
                       
                       //passa por todos os valores de pivo
                       for(int k = 0; k < 5; k++)
                       {
                           
                           //passa por todos os valores de m
                           for(int l = 0; l < 3; l++)
                           {
                                int m = 0;
                                switch(l)
                                {
                                    case 0:
                                        m = 30;
                                        break;
                                    case 1:
                                         m = 100;
                                        break;
                                    case 2:
                                         m = (int)v500.length/3;
                                        break;
                                }
                                qs.ordenaQuickSort(v500, v500.length, m, k);
                           }
                       }
                       
                       
                       break;
                       
                   //vetor 2000
                   case 1:
                       
                       int [] v2k = new int[2000];
                       particionaVetor(vetor, v2k, v2k.length);
                       
                       //passa por todos os valores de pivo
                       for(int k = 0; k < 5; k++)
                       {
                           
                           //passa por todos os valores de m
                           for(int l = 0; l < 3; l++)
                           {
                               int m = 0;
                                switch(l)
                                {
                                    case 0:
                                        m = 30;
                                        break;
                                    case 1:
                                        m =100;
                                        break;
                                    case 2:
                                        m = (int)v2k.length/3;
                                        break;
                                }
                                qs.ordenaQuickSort(v2k, v2k.length, m, k);
                           }
                       }
                       
                       break;
                       
                   // vetor 5000
                   case 2:
                       
                       int [] v5k = new int[5000];
                       particionaVetor(vetor, v5k, v5k.length);
                       
                       //passa por todos os valores de pivo
                       for(int k = 0; k < 5; k++)
                       {
                           
                           //passa por todos os valores de m
                           for(int l = 0; l < 3; l++)
                           {    
                               int m = 0;
                               switch(l)
                               {
                                   case 0:
                                       m = 30;
                                       break;
                                   case 1:
                                       m = 100;
                                       break;
                                   case 2:
                                       m = (int)v5k.length/3;
                                       break;
                               }
                               qs.ordenaQuickSort(v5k, v5k.length, m, k);
                           }
                       }
                       
                       break;
                       
                   //vetor 10000
                   case 3:
                       
                       int [] v10k = new int[10000];
                       particionaVetor(vetor, v10k, v10k.length);
                       
                       //passa por todos os valores de pivo
                       for(int k = 0; k < 5; k++)
                       {
                           
                           //passa por todos os valores de m
                           for(int l = 0; l < 3; l++)
                           {
                               int m = 0;
                               switch(l)
                               {
                                   case 0:
                                       m = 30;
                                       break;
                                   case 1:
                                        m = 100;
                                       break;
                                   case 2:
                                       m = (int)v10k.length/3;
                                       break;
                               }
                               qs.ordenaQuickSort(v10k, v10k.length, m, k);
                           }
                       }
                       
                       break;
                       
                   // vetor 30000
                   case 4:
                       
                       int [] v30k = new int[500];
                       particionaVetor(vetor, v30k, v30k.length);
                       
                       //passa por todos os valores de pivo
                       for(int k = 0; k < 5; k++)
                       {
                           
                           //passa por todos os valores de m
                           for(int l = 0; l < 3; l++)
                           {
                               int m = 0;
                               switch(l)
                               {
                                   case 0:
                                       m = 30;
                                       break;
                                   case 1:
                                       m = 100;
                                       break;
                                   case 2:
                                       m = (int)v30k.length/3;
                                       break;
                               }
                                qs.ordenaQuickSort(v30k, v30k.length, m, k);   
                           }
                       }
                       
                       break;
                       
                   //vetor 50000
                   case 5:
                       
                       int [] v50k = new int[50000];
                       particionaVetor(vetor, v50k, v50k.length);
                       
                       //passa por todos os valores de pivo
                       for(int k = 0; k < 5; k++)
                       {
                           
                           //passa por todos os valores de m
                           for(int l = 0; l < 3; l++)
                           {
                               int m = 0;
                               switch(l)
                               {
                                   case 0:
                                       m = 30;
                                       break;
                                   case 1:
                                       m = 100;
                                       break;
                                   case 2:
                                       m = (int)v50k.length/3;
                                       break;
                               }
                               qs.ordenaQuickSort(v50k, v50k.length, m, k);
                           }
                       }
                       
                       break;
                   
                   //vetor 100000
                   case 6:
                       
                       int [] v100k = new int[100000];
                       particionaVetor(vetor, v100k, v100k.length);
                       
                       //passa por todos os valores de pivo
                       for(int k = 0; k < 5; k++)
                       {
                           
                           //passa por todos os valores de m
                           for(int l = 0; l < 3; l++)
                           {
                               int m = 0;
                               switch(l)
                               {
                                   case 0:
                                       m = 30;
                                       break;
                                   case 1:
                                       m = 100;
                                       break;
                                   case 2:
                                       m = (int)v100k.length/3;
                                       break;
                               }
                               qs.ordenaQuickSort(v100k, v100k.length, m, k);
                           }
                       }
                       
                       break;
                       
                   //vetor 150000
                   case 7:
                       
                       int [] v150k = new int[150000];
                       particionaVetor(vetor, v150k, v150k.length);
                       
                       //passa por todos os valores de pivo
                       for(int k = 0; k < 5; k++)
                       {
                           
                           //passa por todos os valores de m
                           for(int l = 0; l < 3; l++)
                           {
                               int m = 0;
                               switch(l)
                               {
                                   case 0:
                                       m = 30;
                                       break;
                                   case 1:
                                       m = 100;
                                       break;
                                   case 2:
                                       m = (int)v150k.length/3;
                                       break;
                               }
                               qs.ordenaQuickSort(v150k, v150k.length, m, k);
                           }
                       }
                       
                       break;
                       
                   //vetor 200000
                   case 8:
                       
                       int [] v200k = new int[200000];
                       particionaVetor(vetor, v200k, v200k.length);
                       
                       //passa por todos os valores de pivo
                       for(int k = 0; k < 5; k++)
                       {
                           
                           //passa por todos os valores de m
                           for(int l = 0; l < 3; l++)
                           {
                               int m = 0;
                               switch(l)
                               {
                                   case 0:
                                       m = 30;
                                       break;
                                   case 1:
                                       m = 100;
                                       break;
                                   case 2:
                                       m = (int)v200k.length/3;
                                       break;
                               }
                                qs.ordenaQuickSort(v200k, v200k.length, m, k);

                           }
                       }
                       
                       break;
                       
                   //vetor 250000
                   case 9:
                       
                       int [] v250k = new int[250000];
                       particionaVetor(vetor, v250k, v250k.length);
                       
                       //passa por todos os valores de pivo
                       for(int k = 0; k < 5; k++)
                       {
                           
                           //passa por todos os valores de m
                           for(int l = 0; l < 3; l++)
                           {
                               int m = 0;
                               switch(l)
                               {
                                   case 0:
                                       m = 30;
                                       break;
                                   case 1:
                                       m = 100;
                                       break;
                                   case 2:
                                       m = (int)v250k.length/3;
                                       break;
                               }
                               qs.ordenaQuickSort(v250k, v250k.length, m, k);
                           }
                       }
                       
                       break;
                   //vetor 300000
                   case 10:
                       
                       int [] v300k = new int[300000];
                       particionaVetor(vetor, v300k, v300k.length);
                       
                       //passa por todos os valores de pivo
                       for(int k = 0; k < 5; k++)
                       {
                           
                           //passa por todos os valores de m
                           for(int l = 0; l < 3; l++)
                           {
                               int m = 0;
                               switch(l)
                               {
                                   case 0:
                                       m = 0;
                                       break;
                                   case 1:
                                       m = 100;
                                       break;
                                   case 2:
                                       m = (int)v300k.length/3;
                                       break;
                               }
                               qs.ordenaQuickSort(v300k, v300k.length, m, k);
                           }
                       }
                       
                       break;
                   default:
                       
                       break;
               }
           }
       }
        
    }
}
