package com.juniverse.sort.algorithms;

/**
 * Ordenamiento por inserción: inserta cada elemento en su lugar dentro de la parte ya ordenada. O(n²).
 *
 * @author Java Universe
 */
public class InsertSort extends SortBase {

    /**
     * Ordena el arreglo de menor a mayor con el método de inserción.
     * @param nums arreglo que se ordena en el mismo lugar
     */
    @Override
    public void sort(int[] nums) {
        int i;
        int j;
        int temp;
        for (i = 1; i < nums.length; ++i) {
            temp = nums[i];
            for (j = i - 1; (j >= 0) && (temp < nums[j]); j--) {
                nums[j + 1] = nums[j];
            }
            nums[j + 1] = temp;
        }
    }

}
