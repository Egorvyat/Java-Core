/**
 * Java core. Homework 3
 *
 * @author Egor Vyatkin
 * @version 15.12.2021
 */
 
class HomeWork3 {

    public static void main(String[] args) {

        Apple app1 = new Apple();
        Orange orange1 = new Orange();
        System.out.println(app1.getWeight());
        System.out.println(orange1.getWeight());


        FruitBox<Apple> appleBox = new FruitBox<Apple>(app1, 3);
        System.out.println(appleBox.getWeight());
        FruitBox<Orange> orangeBox = new FruitBox<Orange>(orange1, 2);
        System.out.println(orangeBox.getWeight());

        System.out.println();
        System.out.println(orangeBox.compare(appleBox));

    }
}


abstract class Fruit {

    private float weight;

    void setWeight(float weight) {
        this.weight = weight;
    }

    float getWeight() {
        return weight;
    }

    Fruit(){
   }
}

class Orange extends Fruit{

    Orange() {
        this.setWeight(1.5f);
    }
}

class Apple extends Fruit {

    Apple() {
        this.setWeight(1.0f);
    }
}

public class FruitBox<T extends Fruit> {

    private T obj;
    private int fruitCount;

    public FruitBox(T obj, int fruitCount) {
        this.obj = obj;
        this.fruitCount = fruitCount;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void addFruit(int num) {
        fruitCount += num;
    }

    float getWeight() {
        float boxWeight = fruitCount * obj.getWeight();
        return boxWeight;
    }

    public boolean compare(FruitBox<?> box) {
        return this.getWeight() == box.getWeight();
    }
}
