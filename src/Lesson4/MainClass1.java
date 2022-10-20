package Lesson4;

import java.util.*;

public class MainClass1 {
    public static int size = 20;
    public static String[] array = new String[size];
    public static List<String> convertedArray = Arrays.asList(array);

    public static void main (String args[]) {
        createArray();
        HashSet<String> uniqueValue = new HashSet<>(convertedArray);
        System.out.println(uniqueValue);
        HashMap<String,Integer> result = new HashMap<>();
        for(String str: uniqueValue){
            result.put(str,count(str));
        }

        System.out.println(result);
    }

    public static void createArray(){
        Random random = new Random();
        for(int i = 0; i< size; i++){
            array[i] = String.valueOf(random.nextInt(20));
        }

    }

    public static Integer count(String str){
        Integer result = 0;
        for(String strThis : convertedArray){
            if(strThis.equals(str)) result++;
        }

        return result;
    }
}
