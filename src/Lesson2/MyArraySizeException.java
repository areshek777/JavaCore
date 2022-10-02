package Lesson2;

public class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super("Размер переданного массива должен быть строго 4х4");
    }
}
