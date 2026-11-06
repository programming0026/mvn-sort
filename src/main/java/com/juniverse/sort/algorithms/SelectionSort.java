package com.juniverse.sort.algorithms;

/**
 * Ordenamiento por selección: busca el mínimo de lo que falta y lo coloca en su posición. O(n²).
 *
 * @author Java Universe
 */
public class SelectionSort extends SortBase {

    /**
     * Ordena el arreglo de menor a mayor con el método de selección.
     * @param nums arreglo que se ordena en el mismo lugar
     */
    @Override
    public void sort(int[] nums) {
        int i;
        int j;
        int temp;
        int min;
        int minIndex;

        for (i = 0; i < (nums.length - 1); i++) {
            min = nums[i];
            minIndex = i;
            for (j = i + 1; j < nums.length; ++j) {
                if (nums[j] < min) {
                    min = nums[j];
                    minIndex = j;
                }
            }
            if (min < nums[i]) {
                temp = nums[i];
                nums[i] = min;
                nums[minIndex] = temp;
            }
        }
    }

}
