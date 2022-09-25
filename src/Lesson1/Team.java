package Lesson1;

public class Team {

    private String name;
    private Participant[] peoples;

    public Team(String name, Participant[] peoples) {
        this.name = name;
        this.peoples = peoples;
    }

    public String getName(){
        return name;
    }

    public Participant[] getPeoples(){
        return peoples;
    }
}
