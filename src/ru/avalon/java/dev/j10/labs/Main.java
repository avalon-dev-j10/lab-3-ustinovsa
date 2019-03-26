package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.*;
import ru.avalon.java.dev.j10.labs.sort.*;

  


public class Main {

    public static void main(String[] args) {
        
	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * +0. Создать массив из 20 целых чисел и адресовать
	     *    его с сохранить ссылку в переменную array.
	     *
	     * +1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * +2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
      FibonacciInitializer fibIn = new FibonacciInitializer();
      
      int[] arrayFib = new int[20];
      fibIn.initialize(arrayFib);
      fibIn.sumFib(arrayFib);
      int sumFib=0;
          
     RandomInitializer randIn = new RandomInitializer();
     int[] arrayRandomBubble = new int[20];
     randIn.initialize(arrayRandomBubble);
     randIn.printInitArray(arrayRandomBubble);
     
     BubbleSort bS = new BubbleSort();
     bS.sort(arrayRandomBubble);
     bS.printSorted(arrayRandomBubble);
     
     int[] arrayRandomSelection = new int[20];
     randIn.initialize(arrayRandomSelection);
     randIn.printInitArray(arrayRandomSelection);
           
     SelectionSort sS = new SelectionSort();
     sS.sort(arrayRandomSelection);
     sS.printSorted(arrayRandomSelection);
      
     int[] arrayRandomShell = new int[20];
     randIn.initialize(arrayRandomShell);
     randIn.printInitArray(arrayRandomShell);
     
     ShellSort shS = new ShellSort();
     shS.sort(arrayRandomShell);
     shS.printSorted(arrayRandomShell);
      
      
      
      
         
        

    }
}

