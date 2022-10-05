package Lesson3.Lesson3_1;

public class SwapValueArray <T> {

    T variable;
    public T[] swap(T[] array, int a, int b) {
        variable = array[a];
        array[a] = array[b];
        array[b] = variable;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        return array;
    }



}
