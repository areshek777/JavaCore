package Lesson4;

import java.util.HashMap;



public class PhoneBook {
    private HashMap<String, String> phoneSurname = new HashMap<>();

    public void add (String phone, String surname) {
        phoneSurname.put(surname, phone);
    }
    public String getAll(String surname) {
        if(phoneSurname.containsKey(surname)) {
            String result = "Phone:";
            for (String key: phoneSurname.keySet()) {
                if (phoneSurname.get(key) == phoneSurname.get(surname)) {
                    result += phoneSurname.get(key);
                }

            }
            return result;
        } else return "В справочнике нет телефона с такой фамилией";
    }
    public  void print() {
        for (String key: phoneSurname.keySet()){
        System.out.println(key +" = "+phoneSurname.get(key));
        }
    }

}
