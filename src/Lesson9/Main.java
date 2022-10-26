package Lesson9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Student> result = getList(3,3);

        result.stream().flatMap(student -> student.getCourseList().stream()).distinct().collect(Collectors.toList());
        result.stream().flatMap(student -> student.getCourseList().stream()).collect(Collectors.toSet());


        result.stream().sorted((student1,student2) -> student1.getCourseList().size() - student2.getCourseList().size()).limit(3).collect(Collectors.toList());

        //3 задание
        Course paramCourse = new Course("course1");
        result.stream().filter(student -> student.getCourseList().contains(paramCourse)).collect(Collectors.toList());

        System.out.println();

    }

    private static List<Student> getList(int j, int m){
        ArrayList<Student> result = new ArrayList<>();
        for (int i=0; i<j ;i++){
            ArrayList<Course> rooms = new ArrayList<>();
            for (int h=0; h<m ;h++){
                rooms.add(new Course("student"+h));
            }
            result.add(new Student("course"+i, rooms));
        }
        return result;
    }
}
