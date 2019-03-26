package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

/**
 * Пузырьковая сортировка (англ. bubble sort).
 *
 * <p>Простой алгоритм сортировки. Для понимания и
 * реализации этот алгоритм — простейший, но эффективен он
 * лишь для небольших массивов. Сложность алгоритма: O(n^2).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%BF%D1%83%D0%B7%D1%8B%D1%80%D1%8C%D0%BA%D0%BE%D0%BC">Пузырьковая сортировка</a>
 */
public class BubbleSort implements Sort {

    /**
     * {@inheritDoc}
     */
    public void sort(int[] array) {
        /*
         * TODO(Студент): Реализовать метод sort класса BubbleSort
         */
        for (int i = 0; i < array.length - 1; i++) 
            for (int j = 0; j < array.length-i-1; j++) 
                if (array[j] > array[j+1]) 
                { 
                    // Меняем arr[j+1] and arr[i] 
                    int k = array[j]; 
                    array[j] = array[j+1]; 
                    array[j+1] = k;
    }
}

    @Override
    public void printSorted(int[] array) {
        System.out.println("Bubble-Sorted Random Array :" );
        for (int arr: array){
        System.out.print(arr+" ");
        }
        System.out.println();
    }
    
}
