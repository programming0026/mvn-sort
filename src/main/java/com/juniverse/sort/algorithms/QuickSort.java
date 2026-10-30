package com.juniverse.sort.algorithms;

/**
 * Quicksort: divide el arreglo alrededor de un pivote (el elemento central) y ordena cada parte. O(n log n) en promedio.
 *
 * @author linux
 */
public class QuickSort extends SortBase {

    /**
     * Ordena el tramo {@code [inf, sup]} y se llama recursivamente con las dos mitades.
     * @param iNums arreglo a ordenar
     * @param inf índice inicial
     * @param sup índice final
     */
    private void qs(int iNums[], int inf, int sup) {
        int izq; 
        int der;
        int mitad;
        int x;

        izq = inf;
        der = sup;
        mitad = iNums[(izq + der) / 2];
        do {
            while (iNums[izq] < mitad && izq < sup) {
                izq++;
            }
            while (mitad < iNums[der] && der > inf) {
                der--;
            }

            if (izq <= der) {
                x = iNums[izq];
                iNums[izq] = iNums[der];
                iNums[der] = x;
                izq++;
                der--;
            }

        } while (izq <= der);
        if (inf < der) {
            qs(iNums, inf, der);
        }
        if (izq < sup) {
            qs(iNums, izq, sup);
        }
    }

    /**
     * Ordena el arreglo de menor a mayor con el método de Quicksort.
     * @param nums arreglo que se ordena en el mismo lugar
     */
    @Override
    public void sort(int[] nums) {
        if (nums.length > 1) {
            qs(nums, 0, nums.length - 1);
        }
    }

}
