package exercise1_4;

public class TestMain {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.0);
        System.out.println(circle1.toString());
        Rectangle rectangle1 = new Rectangle(2, 3);
        System.out.println(rectangle1.toString());
        System.out.println("area= " + rectangle1.getArea() + " perimeter= " + rectangle1.getPerimeter());

        Square square1 = new Square(5);
        System.out.println(square1.toString());
        square1.setLength(7);
        System.out.println(square1.toString());
    }
}
