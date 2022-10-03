package Lesson3.Lesson3_2;

public class Box <T extends Fruit> {
    T[] fruits;

    public Box(T[] fruits) {
        this.fruits = fruits;
    }

    public float getWeight() {
        float result = 0f;
        for(T weight : getFruitsArray()) {
            if(weight != null) {
                float value = weight.getAmount();
                result += value;
            }
        }
        if(getFruitsArray()[0] != null && getFruitsArray()[0].getName().equals("orange")){
            result = result * 1.5f;
        }
        return result;
    }

    public String name(){
        return getFruitsArray()[0].getName();
    }

    public Boolean compare(Box<? extends Fruit> box){
        if(this.name() == box.name()) return true;
        return false;
    }

    public void sprinkleFruit(Box<T> box){
        System.out.println("В текущей коробке до пересыпания находится: " + this.getWeight() + " фруктов");
        System.out.println("В коробке из которой нужно пересыпать до пересыпания находится: " + box.getWeight() + " фруктов");

            for(int i = 0; i < box.getFruitsArray().length; i++) {
                if(box.getFruitsArray()[i] != null) {
                    this.getFruitsArray()[getSize()] = box.getFruitsArray()[i];
                    box.getFruitsArray()[i] = null;
                }

            }
       System.out.println("В текущей коробке после пересыпания находится: " + this.getWeight() + " фруктов");
       System.out.println("В коробке из которой нужно пересыпать после пересыпания находится: " + box.getWeight() + " фруктов");
    }
    public T[] getFruitsArray() {
        return fruits;
    }

    private Integer getSize(){
        Integer result = 0;
        for(T t: getFruitsArray()){
            if(t!=null)result++;

        }
        return result;
    }

}
