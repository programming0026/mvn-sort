package com.juniverse.sort.algorithms;

/**
 * Ordenamiento Shell: inserción con saltos decrecientes (9, 5, 3, 2, 1). Mejora a la inserción simple.
 *
 * @author linux
 */
public class ShellSort extends SortBase {

    /**
     * Ordena el arreglo de menor a mayor con el método de Shell.
     * @param nums arreglo que se ordena en el mismo lugar
     */
    @Override
    public void sort(int[] nums) {
        int i;
        int j;
        int temp;
        int x;
        int a[] = new int[5];

        a[0] = 9;
        a[1] = 5;
        a[2] = 3;
        a[3] = 2;
        a[4] = 1;
        for (int k = 0; k < 5; k++) {
            temp = a[k];
            for (i = temp; i < nums.length; ++i) {
                x = nums[i];
                for (j = i - temp; (j >= 0) && (x < nums[j]); j = j - temp) {
                    nums[j + temp] = nums[j];
                }

                nums[j + temp] = x;
            }
        }
    }

}
