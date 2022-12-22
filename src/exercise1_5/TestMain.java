package exercise1_5;

public class TestMain {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Cat1");
        cat1.greets();
        System.out.println(cat1.toString());

        Dog dog1 = new Dog("Dog1");
        dog1.greets();
        System.out.println(dog1.toString());
        Dog dog2 = new Dog("Dog2");
        dog1.greets(dog2);
    }
}
