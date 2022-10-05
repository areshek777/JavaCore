package Lesson3.Lesson3_2;

public class RunApp {

    public static void main(String[] args){

        Apple[] apple = new Apple[5];
        Orange[] orange = new Orange[5];

        Apple[] apple_test = new Apple[5];

        Apple apple0 = new Apple(10f);
        Apple apple1 = new Apple(10f);
        Apple apple2 = new Apple(10f);
        Apple apple3 = new Apple(10f);
        Apple apple4 = new Apple(10f);

        apple[0] = apple0;
        apple[1] = apple1;

        apple_test[2] = apple2;
        apple_test[3] = apple3;
        apple_test[4] = apple4;

        Box<Apple> apples = new Box<>(apple);
        Box<Apple> apples1 = new Box<>(apple_test);




        Orange orange0 = new Orange(5f);
        Orange orange1 = new Orange(5f);
        Orange orange2 = new Orange(5f);
        Orange orange3 = new Orange(5f);
        Orange orange4 = new Orange(5f);
        orange[0] = orange0;
        orange[1] = orange1;
        orange[2] = orange2;
        orange[3] = orange3;
        orange[4] = orange4;
        Box<Orange> oranges = new Box<>(orange);

        System.out.println(apples.getWeight());
        System.out.println(oranges.getWeight());

        System.out.println(apples.compare(oranges));
        apples.sprinkleFruit(apples1);


    }
}
