package com.juniverse.sort;

import com.juniverse.sort.algorithms.TypeSort;
import com.juniverse.sort.algorithms.SortFactory;
import com.juniverse.sort.algorithms.SortBase;
import java.util.Random;

import java.util.logging.Logger;
/**
 * Ordena arreglos de 10 números aleatorios con cada algoritmo y muestra el antes y el después.
 *
 * @author Java Universe
 */
public class Main {
    private static final Logger LOGGER = AppLogger.get(Main.class);


    /**
     * Punto de entrada: prueba los seis algoritmos.
     * @param args no se usan
     */
    public static void main(String[] args) {
        int[] nums = readNums(10);
        SortBase sortBase = SortFactory.createFactory(TypeSort.BUBBLESORT);
        sort(sortBase, "==BubbleSort==", nums);

        nums = readNums(10);
        sortBase = SortFactory.createFactory(TypeSort.SHELLSORT);
        sort(sortBase, "==ShellSort==", nums);

        nums = readNums(10);
        sortBase = SortFactory.createFactory(TypeSort.INSERTSORT);
        sort(sortBase, "==InsertSort==", nums);

        nums = readNums(10);
        sortBase = SortFactory.createFactory(TypeSort.SHAKESORT);
        sort(sortBase, "==ShakeSort==", nums);

        nums = readNums(10);
        sortBase = SortFactory.createFactory(TypeSort.QUICKSORT);
        sort(sortBase, "==Quicksort==", nums);

        nums = readNums(10);
        sortBase = SortFactory.createFactory(TypeSort.SELECTIONSORT);
        sort(sortBase, "==SelectionSort==", nums);

    }

    /**
     * Genera números aleatorios entre 0 y 999.
     * @param max cantidad de números
     */
    private static int[] readNums(int max) {
        int[] nums = new int[max];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(1000);
        }
        return nums;
    }

    /**
     * Muestra los datos, los ordena y vuelve a mostrarlos.
     * @param sortBase algoritmo a usar
     * @param text título de la prueba
     * @param nums datos a ordenar
     */
    private static void sort(SortBase sortBase, String text, int[] nums) {
        LOGGER.info(text);
        LOGGER.info("Datos introducidos:");
        sortBase.print(nums);
        sortBase.sort(nums);
        LOGGER.info("Datos ordenados: ");
        sortBase.print(nums);
    }

}
