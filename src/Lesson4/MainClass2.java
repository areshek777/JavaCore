package Lesson4;

import java.util.HashMap;

public class MainClass2 {

    public static void main (String args[]) {
        PhoneBook directory = new PhoneBook();
        directory.add("123", "Иванов");
        directory.add("777", "Сидоров");
        directory.add("321", "Петров");
        directory.print();
        System.out.println(directory.getAll("Сидоров"));
    }
}
