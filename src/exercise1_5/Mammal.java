package exercise1_5;

public class Mammal extends Animal {
    public Mammal() {
    }

    public Mammal(String name) {
        super(name);
    }

    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}
