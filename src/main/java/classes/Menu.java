/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Administrador
 */
public class Menu {
    /**
     * valores - matriz de valores
     * vetorOriginal - vetor desordenado
     * vetorOrdenado - vetor ordenado
     */
    public void show(double[][][][] valores, int[] vetorOriginal, int[] vetorOrdenado)
    {
        System.out.println("ORDENACAO QUICK SORT");
        System.out.print("Vetor original: ");
        this.imprimeVetor(vetorOriginal, 30);
        System.out.println("...");
        System.out.print("Vetor ordenado: ");
        this.imprimeVetor(vetorOrdenado, 30);
        System.out.println("...");
        
        for(int i = 0; i < valores.length; i++)
        {
            for(int j = 0; j < valores[i].length; j++)
            {
                for(int k = 0; k < valores[i][j].length; k++)
                {
                    //seleciona o vetor, sendo 0 o de 500 posições e 10 o de 300000
                    switch(i)
                    {
                        case 0:
                            //seleciona o pivo
                            switch(j)
                            {
                                case 0:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   500   PIVO inicio   ");
                                    
                                    break;
                                case 1:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   500   PIVO fim   ");
                                    break;
                                case 2:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   500   PIVO metade   ");
                                    break;
                                case 3:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   500   PIVO mediana   ");
                                    break;
                                case 4:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   500   PIVO aleatorio   ");
                                    break;
                            }
                            
                            break;
                        case 1:
                            //seleciona o pivo
                            switch(j)
                            {
                                case 0:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   2K   PIVO inicio   ");
                                    
                                    break;
                                case 1:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   2K   PIVO fim   ");
                                    break;
                                case 2:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   2K   PIVO metade   ");
                                    break;
                                case 3:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   2K   PIVO mediana   ");
                                    break;
                                case 4:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   2K   PIVO aleatorio   ");
                                    break;
                            }
                            break;
                        case 2:
                            //seleciona o pivo
                            switch(j)
                            {
                                case 0:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   5K   PIVO inicio   ");
                                    
                                    break;
                                case 1:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   5K   PIVO fim   ");
                                    break;
                                case 2:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   5K   PIVO metade   ");
                                    break;
                                case 3:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   5K   PIVO mediana   ");
                                    break;
                                case 4:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   5K   PIVO aleatorio   ");
                                    break;
                            }
                            break;
                        case 3:
                            //seleciona o pivo
                            switch(j)
                            {
                                case 0:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   10K   PIVO inicio   ");
                                    
                                    break;
                                case 1:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   10K   PIVO fim   ");
                                    break;
                                case 2:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   10K   PIVO metade   ");
                                    break;
                                case 3:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   10K   PIVO mediana   ");
                                    break;
                                case 4:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   10K   PIVO aleatorio   ");
                                    break;
                            }
                            break;
                        case 4:
                            //seleciona o pivo
                            switch(j)
                            {
                                case 0:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   30K   PIVO inicio   ");
                                    
                                    break;
                                case 1:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   30K   PIVO fim   ");
                                    break;
                                case 2:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   30K   PIVO metade   ");
                                    break;
                                case 3:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   30K   PIVO mediana   ");
                                    break;
                                case 4:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   30K   PIVO aleatorio   ");
                                    break;
                            }
                            break;
                        case 5:
                            //seleciona o pivo
                            switch(j)
                            {
                                case 0:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   50K   PIVO inicio   ");
                                    
                                    break;
                                case 1:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   50K   PIVO fim   ");
                                    break;
                                case 2:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   50K   PIVO metade   ");
                                    break;
                                case 3:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   50K   PIVO mediana   ");
                                    break;
                                case 4:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   50K   PIVO aleatorio   ");
                                    break;
                            }
                            break;
                        case 6:
                            //seleciona o pivo
                            switch(j)
                            {
                                case 0:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   100K   PIVO inicio   ");
                                    
                                    break;
                                case 1:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   100K   PIVO fim   ");
                                    break;
                                case 2:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   100K   PIVO metade   ");
                                    break;
                                case 3:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   100K   PIVO mediana   ");
                                    break;
                                case 4:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   100K   PIVO aleatorio   ");
                                    break;
                            }
                            break;
                        case 7:
                            //seleciona o pivo
                            switch(j)
                            {
                                case 0:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   150K   PIVO inicio   ");
                                    
                                    break;
                                case 1:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   150K   PIVO fim   ");
                                    break;
                                case 2:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   150K   PIVO metade   ");
                                    break;
                                case 3:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   150K   PIVO mediana   ");
                                    break;
                                case 4:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   150K   PIVO aleatorio   ");
                                    break;
                            }
                            break;
                        case 8:
                            //seleciona o pivo
                            switch(j)
                            {
                                case 0:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   200K   PIVO inicio   ");
                                    
                                    break;
                                case 1:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   200K   PIVO fim   ");
                                    break;
                                case 2:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   200K   PIVO metade   ");
                                    break;
                                case 3:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   200K   PIVO mediana   ");
                                    break;
                                case 4:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   200K   PIVO aleatorio   ");
                                    break;
                            }
                            break;
                        case 9:
                            //seleciona o pivo
                            switch(j)
                            {
                                case 0:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   250K   PIVO inicio   ");
                                    
                                    break;
                                case 1:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   250K   PIVO fim   ");
                                    break;
                                case 2:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   250K   PIVO metade   ");
                                    break;
                                case 3:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   250K   PIVO mediana   ");
                                    break;
                                case 4:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   250K   PIVO aleatorio   ");
                                    break;
                            }
                            break;
                        case 10:
                            //seleciona o pivo
                            switch(j)
                            {
                                case 0:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   300K   PIVO inicio   ");
                                    
                                    break;
                                case 1:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   300K   PIVO fim   ");
                                    break;
                                case 2:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   300K   PIVO metade   ");
                                    break;
                                case 3:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   300K   PIVO mediana   ");
                                    break;
                                case 4:
                                    System.out.println("------------------------------------------");
                                    System.out.print("VETOR   300K   PIVO aleatorio   ");
                                    break;
                            }
                            break;
                        default:
                            
                            break;
                    }
                    
                    //seleciona o M
                    switch(k)
                    {
                        case 0:
                            System.out.println("M = 30");
                            break;
                        case 1:
                            System.out.println("M = 100");
                            break;
                        case 2:
                            System.out.println("M = 1/3");
                            break;
                    }
                    
                    //tempo em ms
                    double tempo = valores[i][j][k][0]/1000000;
                    System.out.println("TEMPO (ms)   " + (tempo)/100);
                    System.out.println("ACESSOS   " + (int)valores[i][j][k][1]/100);
                    System.out.println("COMPARACOES   " + (int)valores[i][j][k][2]/100);
                    System.out.println("PIVOS   " + (int)valores[i][j][k][3]/100);
                    System.out.println("TROCAS   " + (int)valores[i][j][k][4]/100);
                    System.out.println("------------------------------------");
                    
                }
            }
        }
    }
    
    /**
     * 
     * vetor - vetor que sera impresso
     * n - posicao ate a qual o vetor sera impresso 
     */
    public void imprimeVetor(int vetor[], int n)
    {
        for(int i = 0; i < n; i++)
        {
            System.out.print(vetor[i] + ", ");
        }
    }
}
