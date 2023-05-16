/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sortingalgorithms;

import classes.Menu;
import classes.QuickSort;
import java.util.Random;

/**
 *
 * @author cauaa
 */
public class SortingAlgorithms {
    
    /**
     * preenche um vetor com numeros aleatorios de 1 a 1000
     * 
     * vetor - vetor que sera preenchido
     */
    public static void preencheVetor(int[] vetor)
    {
        Random r = new Random();
        
        
        for(int i = 0; i < vetor.length; i++)
        {
            //gera valores aleatorios entre 1 e o tamanho do vetor, que no caso é 1000
            vetor[i] = r.nextInt(1000) + 1;
        }
    }
    
    /**
     * vetor - vetor original
     * particao - vetor que armazenara o intervalo de 0 a tam do vetor original
     * tam - tamanho da particao
     */
    public static void particionaVetor(int[] vetor, int[] particao, int tam)
    {
        for(int i = 0; i < tam; i++)
        {
            particao[i] = vetor[i];
        }
    }
    
    //inicializa todas as posicoes da matriz de valores como 0
    public static void inicializaVetorValores(double[][][][] valores)
    {
        for(int i = 0; i < valores.length; i++)
        {
            for(int j = 0; j < valores[i].length; j++)
            {
                for(int k = 0; k < valores[i][j].length; k++)
                {
                    for(int l = 0; l < valores[i][j][k].length; l++)
                    {
                        valores[i][j][k][l] = 0;
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        
        int[] vetor = new int[300000];
        
        //usado para imprimir os valores
        Menu menu = new Menu();
        
        QuickSort qs = new QuickSort();
        
        //vetor usado pelo menu para imprimir o vetor ordenado no final
        int[] vetorOrdenado = new int[500];
        
        /**
         * matriz usada para salvar os valores de tempo, acessos, comparações,
         * trocas e alterações de pivô para cada vetor. esses valores serao
         * usados para calcular a media.
         * 
         * valores[0:11] - vetores de 500 a 300000
         * valores[][0:4] - possibilidades de pivo
         * valores[][][0:3] - possibilidades de M
         * valores[][][][0] - tempo em ms
         * valores[][][][1] - acessos
         * valores[][][][2] - comparacoes
         * valores[][][][3] - pivos
         * valores[][][][4] - trocas
         */
        double[][][][] valores = new double[11][5][3][5];
        
        //coloca os valores iniciais do vetor valores como sendo 0
        inicializaVetorValores(valores);
        
        //roda 100x para calcular as medias
       for(int i = 0; i < 100; i++)
       {
           preencheVetor(vetor);
           
           //passa pelas 11 opções de tamanho do vetor
           for(int j = 0; j < 11; j++)
           {
               switch(j)
               {
                   //vetor de 500
                   case 0:
                       //int [] v500 = new int[500];
                       particionaVetor(vetor, vetorOrdenado, vetorOrdenado.length);
                       
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
                                         m = (int)vetorOrdenado.length/3;
                                        break;
                                }
                                double[] aux = qs.ordenaQuickSort(vetorOrdenado, vetorOrdenado.length, m, k);
                                valores[0][k][l][0] = valores[0][k][l][0] + aux[0];
                                valores[0][k][l][1] = valores[0][k][l][1] + aux[1];
                                valores[0][k][l][2] = valores[0][k][l][2] + aux[2];
                                valores[0][k][l][3] = valores[0][k][l][3] + aux[3];
                                valores[0][k][l][4] = valores[0][k][l][4] + aux[4];
                                
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
                                double[] aux = qs.ordenaQuickSort(v2k, v2k.length, m, k);
                                
                                valores[1][k][l][0] = valores[1][k][l][0] + aux[0];
                                valores[1][k][l][1] = valores[1][k][l][1] + aux[1];
                                valores[1][k][l][2] = valores[1][k][l][2] + aux[2];
                                valores[1][k][l][3] = valores[1][k][l][3] + aux[3];
                                valores[1][k][l][4] = valores[1][k][l][4] + aux[4];
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
                               double[] aux = qs.ordenaQuickSort(v5k, v5k.length, m, k);
                               
                               valores[2][k][l][0] = valores[2][k][l][0] + aux[0];
                               valores[2][k][l][1] = valores[2][k][l][1] + aux[1];
                               valores[2][k][l][2] = valores[2][k][l][2] + aux[2];
                               valores[2][k][l][3] = valores[2][k][l][3] + aux[3];
                               valores[2][k][l][4] = valores[2][k][l][4] + aux[4];
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
                               double[] aux = qs.ordenaQuickSort(v10k, v10k.length, m, k);
                               
                               valores[3][k][l][0] = valores[3][k][l][0] + aux[0];
                               valores[3][k][l][1] = valores[3][k][l][1] + aux[1];
                               valores[3][k][l][2] = valores[3][k][l][2] + aux[2];
                               valores[3][k][l][3] = valores[3][k][l][3] + aux[3];
                               valores[3][k][l][4] = valores[3][k][l][4] + aux[4];
                               
                               
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
                               double[] aux = qs.ordenaQuickSort(v30k, v30k.length, m, k); 
                                
                               valores[4][k][l][0] = valores[4][k][l][0] + aux[0];
                               valores[4][k][l][1] = valores[4][k][l][1] + aux[1];
                               valores[4][k][l][2] = valores[4][k][l][2] + aux[2];
                               valores[4][k][l][3] = valores[4][k][l][3] + aux[3];
                               valores[4][k][l][4] = valores[4][k][l][4] + aux[4];
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
                               double[] aux = qs.ordenaQuickSort(v50k, v50k.length, m, k);
                               
                               valores[5][k][l][0] = valores[5][k][l][0] + aux[0];
                               valores[5][k][l][1] = valores[5][k][l][1] + aux[1];
                               valores[5][k][l][2] = valores[5][k][l][2] + aux[2];
                               valores[5][k][l][3] = valores[5][k][l][3] + aux[3];
                               valores[5][k][l][4] = valores[5][k][l][4] + aux[4];
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
                               double[] aux = qs.ordenaQuickSort(v100k, v100k.length, m, k);
                               
                               valores[6][k][l][0] = valores[6][k][l][0] + aux[0];
                               valores[6][k][l][1] = valores[6][k][l][1] + aux[1];
                               valores[6][k][l][2] = valores[6][k][l][2] + aux[2];
                               valores[6][k][l][3] = valores[6][k][l][3] + aux[3];
                               valores[6][k][l][4] = valores[6][k][l][4] + aux[4];
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
                               double[] aux = qs.ordenaQuickSort(v150k, v150k.length, m, k);
                               
                               valores[7][k][l][0] = valores[7][k][l][0] + aux[0];
                               valores[7][k][l][1] = valores[7][k][l][1] + aux[1];
                               valores[7][k][l][2] = valores[7][k][l][2] + aux[2];
                               valores[7][k][l][3] = valores[7][k][l][3] + aux[3];
                               valores[7][k][l][4] = valores[7][k][l][4] + aux[4];
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
                               double[] aux = qs.ordenaQuickSort(v200k, v200k.length, m, k);
                                
                               valores[8][k][l][0] = valores[8][k][l][0] + aux[0];
                               valores[8][k][l][1] = valores[8][k][l][1] + aux[1];
                               valores[8][k][l][2] = valores[8][k][l][2] + aux[2];
                               valores[8][k][l][3] = valores[8][k][l][3] + aux[3];
                               valores[8][k][l][4] = valores[8][k][l][4] + aux[4];

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
                               double[] aux = qs.ordenaQuickSort(v250k, v250k.length, m, k);
                               
                               valores[9][k][l][0] = valores[9][k][l][0] + aux[0];
                               valores[9][k][l][1] = valores[9][k][l][1] + aux[1];
                               valores[9][k][l][2] = valores[9][k][l][2] + aux[2];
                               valores[9][k][l][3] = valores[9][k][l][3] + aux[3];
                               valores[9][k][l][4] = valores[9][k][l][4] + aux[4];
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
                               double[] aux = qs.ordenaQuickSort(v300k, v300k.length, m, k);
                               
                               valores[10][k][l][0] = valores[10][k][l][0] + aux[0];
                               valores[10][k][l][1] = valores[10][k][l][1] + aux[1];
                               valores[10][k][l][2] = valores[10][k][l][2] + aux[2];
                               valores[10][k][l][3] = valores[10][k][l][3] + aux[3];
                               valores[10][k][l][4] = valores[10][k][l][4] + aux[4];
                           }
                       }
                       
                       break;
                   default:
                       
                       break;
               }
           }
       }
        menu.show(valores, vetor, vetorOrdenado);
    }
}
