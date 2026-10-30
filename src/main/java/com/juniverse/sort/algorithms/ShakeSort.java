package com.juniverse.sort.algorithms;

/**
 * Ordenamiento de sacudida (cocktail): burbuja que recorre el arreglo en ambos sentidos. O(n²).
 *
 * @author linux
 */
public class ShakeSort extends SortBase {

    /**
     * Ordena el arreglo de menor a mayor con el método de sacudida.
     * @param nums arreglo que se ordena en el mismo lugar
     */
    @Override
    public void sort(int[] nums) {
        int i;
        int temp;
        boolean inter;
        do {
            inter = false;
            for (i = nums.length - 1; i > 0; --i) {
                if (nums[i - 1] > nums[i]) {
                    temp = nums[i - 1];
                    nums[i - 1] = nums[i];
                    nums[i] = temp;
                    inter = true;
                }
            }
            for (i = 1; i < nums.length; ++i) {
                if (nums[i - 1] > nums[i]) {
                    temp = nums[i - 1];
                    nums[i - 1] = nums[i];
                    nums[i] = temp;
                    inter = true;
                }
            }
        } while (inter);
    }

}
