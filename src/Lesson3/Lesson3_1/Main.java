package Lesson3.Lesson3_1;

public class Main {
    static String[] str = {"test1","test2","test3"};
    static Integer[] unit = {1, 2, 3};
    static Float[] natant = {1f, 2f, 3f};

    public static void main(String[] args) {
        SwapValueArray<String> test1 = new SwapValueArray<>();
        SwapValueArray<Integer> test2 = new SwapValueArray<>();
        SwapValueArray<Float> test3 = new SwapValueArray<>();
        test1.swap(str, 1, 2);
        test2.swap(unit, 1, 2);
        test3.swap(natant, 1, 2);



    }




}
