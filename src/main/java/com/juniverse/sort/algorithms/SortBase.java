package com.juniverse.sort.algorithms;


import java.util.logging.Logger;
import com.juniverse.sort.AppLogger;
import java.util.Arrays;
/**
 * Clase base de los algoritmos de ordenamiento de enteros.
 *
 * @author linux
 */
public abstract class SortBase {
    private static final Logger LOGGER = AppLogger.get(SortBase.class);


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
        LOGGER.info(Arrays.toString(nums));
        LOGGER.info("");
    }
}
