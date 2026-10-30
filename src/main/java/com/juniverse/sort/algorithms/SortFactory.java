package com.juniverse.sort.algorithms;

/**
 * Fábrica que crea el algoritmo de ordenamiento según {@link TypeSort}.
 *
 * @author linux
 */
public final class SortFactory {

    /** Clase de utilidades: no se instancia. */
    private SortFactory() {

    }

    /**
     * Crea el algoritmo pedido.
     * @param type algoritmo
     * @return instancia del algoritmo
     * @throws IllegalArgumentException si el tipo no es válido
     */
    public static SortBase createFactory(TypeSort type) {
        switch (type) {
            case BUBBLESORT -> {
                return new BubbleSort();
            }
            case INSERTSORT -> {
                return new InsertSort();
            }
            case QUICKSORT -> {
                return new QuickSort();
            }
            case SELECTIONSORT -> {
                return new SelectionSort();
            }
            case SHAKESORT -> {
                return new ShakeSort();
            }
            case SHELLSORT -> {
                return new ShellSort();
            }
            default -> throw new IllegalArgumentException("La opcion no es valida");
        }

    }
}
