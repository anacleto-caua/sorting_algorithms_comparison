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
    //mostra os resultados
    public void show(double[][][][] valores, int[] vetorOriginal, int[] vetorOrdenado)
    {
        System.out.println("ORDENACAO QUICK SORT");
        System.out.print("Vetor original: ");
        this.imprimeVetor(vetorOriginal, 30);
        System.out.println("...");
        System.out.print("Vetor ordenado: ");
        this.imprimeVetor(vetorOrdenado, 30);
        System.out.println("...");
    }
    
    //imprime o vetor
    public void imprimeVetor(int vetor[], int n)
    {
        for(int i = 0; i < n; i++)
        {
            System.out.print(vetor[i] + ", ");
        }
    }
}
