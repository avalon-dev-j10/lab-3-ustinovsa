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
      int sumFib=0;
     for (int arr: arrayFib){
     sumFib=sumFib+arr;
     System.out.println(arr);
     }
     System.out.println("Sum of the fibonacci numbers in the array = " + sumFib);
     
     RandomInitializer randIn = new RandomInitializer();
     int[] arrayRandomBubble = new int[20];
     randIn.initialize(arrayRandomBubble);
     System.out.println(" \n NOT-sorted randomBubble array:");
     for (int arr: arrayRandomBubble){
     System.out.print(arr+" ");
     }
     
     BubbleSort bS = new BubbleSort();
     bS.sort(arrayRandomBubble);
     
     System.out.println(" \n Bubble-sorted randomSelection array:");
     for (int arr: arrayRandomBubble){
     System.out.print(arr+" ");
     }

     
     int[] arrayRandomSelection = new int[20];
     randIn.initialize(arrayRandomSelection);
     System.out.println(" \n NOT-sorted randomShell array:");
     for (int arr: arrayRandomSelection){
     System.out.print(arr+" ");
     }
      
     SelectionSort sS = new SelectionSort();
     sS.sort(arrayRandomSelection);
     System.out.println(" \n Selection-sorted random array:");
     for (int arr: arrayRandomSelection){
     System.out.print(arr+" ");
     }
      
      
      
      
     int[] arrayRandomShell = new int[20];
     randIn.initialize(arrayRandomShell);
     System.out.println(" \n NOT-sorted random array:");
     for (int arr: arrayRandomShell){
     System.out.print(arr+" ");
     }
     
     
     ShellSort shS = new ShellSort();
     shS.sort(arrayRandomShell);
     System.out.println(" \n Shell-sorted random array:");
     for (int arr1: arrayRandomShell){
     System.out.print(arr1+" ");
      
      
      
      
         
        

    }
}
}

