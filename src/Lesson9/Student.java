package Lesson9;

import java.util.List;

public class Student {

    private String name;

    List<Course> courseList;

    public Student(String name, List<Course> roomList) {
        this.name = name;
        this.courseList = roomList;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourseList() {
        return courseList;
    }
}
