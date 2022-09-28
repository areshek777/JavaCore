package Lesson2;

public class AppMain {

    static String[][] test1 = {{"7", "15", "100", "2"}, {"3", "5", "8", "12"}, {"4", "7", "0", "25"}, {"13", "34", "45", "65"}};
    static String[][] test2 = {{"23", "21"}, {"32", "42",}, {"42", "25"}, {"23", "24"}};
    static String[][] test3 = {{"123", "432", "32", "5"}, {"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "f"}};

    static int scale = 4;

    public static void main(String[] args) {
        try {
            System.out.println(testArray(test1));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(testArray(test2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(testArray(test3));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static int testArray(String[][] value) throws MyArraySizeException, MyArrayDataException {
        if (value.length != scale || value[0].length != scale) throw new MyArraySizeException();
        int result = 0;
        int i = 0;
        int j = 0;
        try {
            for (; i < value.length; i++) {
                j = 0;
                for (; j < value[i].length; j++) {
                    result += Integer.parseInt(value[i][j]);
                }
            }
        } catch (NumberFormatException ex) {
            throw new MyArrayDataException("Массив невозможно преобразовать в число, ошибку преобразования вызывают следующие позиции в массиве: " + i + ", " + j);
        }
        return result;
    }

}