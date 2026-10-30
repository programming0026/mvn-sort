package com.juniverse.sort.algorithms;

/**
 * Ordenamiento de burbuja: compara pares contiguos e intercambia los desordenados. O(n²).
 *
 * @author linux
 */
public class BubbleSort extends SortBase {
    
    /**
     * Ordena el arreglo de menor a mayor con el método de burbuja.
     * @param nums arreglo que se ordena en el mismo lugar
     */
    @Override
    public void sort(int nums[]) {
        int i;
        int j;
        int temp;
        for (i = 0; i < nums.length - 1; i++) {
            for (j = 1; j < nums.length; j++) {
                if (nums[j] < nums[j - 1]) {
                    temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
    }
}
