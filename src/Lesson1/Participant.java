package Lesson1;

public class Participant {
    private String name;
    private int speed;
    private int accuracy;

    public Participant(String name, int speed, int accuracy) {
        this.name = name;
        this.speed = speed;
        this.accuracy = accuracy;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAccuracy() {
        return accuracy;
    }
}
