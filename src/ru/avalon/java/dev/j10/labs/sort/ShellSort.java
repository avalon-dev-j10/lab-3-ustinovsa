package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

/**
 * Сортировка Шелла (англ. Shell sort).
 *
 * <p>Алгоритм сортировки, являющийся усовершенствованным
 * вариантом сортировки вставками. Идея метода Шелла состоит
 * в сравнении элементов, стоящих не только рядом, но и на
 * определённом расстоянии друг от друга. Иными словами —
 * это сортировка вставками с предварительными «грубыми»
 * проходами. Аналогичный метод усовершенствования
 * пузырьковой сортировки называется сортировка расчёской.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%A8%D0%B5%D0%BB%D0%BB%D0%B0">Сортировка Шелла</a>
 */
public class ShellSort implements Sort {

    /**
     * {@inheritDoc}
     */
    public void sort(int[] array) {
        /*
         * TODO(Студент): Реализовать метод sort класса ShellSort
         */
        /*определяем инкремент сортировки делением пополам без остатка
        цикл повторяется пока инкремент не станет 1 
        и массив не будет отсортирован
        */
        
        for(int inc=array.length/2; inc>0; inc = inc/2){
//проходим по элементам с использованием инкремента
            for (int j = inc; j<array.length; j++){
                /*сравниваем j-й элемент c элементом j-inc(номер которого меньше на инкремент
                    в нашем случае 10 и 0...19 и 9.
                далее уменьшаем инкремент в два раза
                    */
                int k = array[j];
                for(int n=j; n>=inc && array[n-inc]>k; n-=inc){ 
// обмениваем значениями ячейки при выполнении условия сравнения
                    array[n]=array[n-inc];
                    array[n-inc]=k;
                }
            }
        }
        
    }

    @Override
    public void printSorted(int[] array) {
   System.out.println("Shell-Sorted Random Array :" );
        for (int arr: array){
        System.out.print(arr+" ");
        }
        System.out.println();
    }
    
    
}
