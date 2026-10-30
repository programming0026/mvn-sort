package com.juniverse.sort.algorithms;

/**
 * Clase base de los algoritmos de ordenamiento de enteros.
 *
 * @author linux
 */
public abstract class SortBase {

    /**
     * Ordena el arreglo de menor a mayor.
     * @param nums arreglo que se ordena en el mismo lugar
     */
    public abstract void sort(int nums[]);

    /**
     * Imprime los elementos en una línea.
     * @param nums arreglo a mostrar
     */
    public void print(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
