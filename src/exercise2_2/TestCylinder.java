package exercise2_2;

import exercise1_1.Circle;

public class TestCylinder {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.0,"blue");
        Circle circle2 = new Circle(6.0,"yellow");
        Cylinder cylinder1 = new Cylinder(circle1,5.0);
        System.out.println(cylinder1.toString());
        cylinder1.setBase(circle2);
        System.out.println(cylinder1.toString());
    }
}
