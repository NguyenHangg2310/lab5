package exercise2_1;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub lineSub1 = new LineSub(1, 2, 3, 4);
        System.out.println(lineSub1);

        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        LineSub lineSub2 = new LineSub(point1, point2);
        System.out.println(lineSub2);
        lineSub2.setBeginXY(5, 6);
        System.out.println(lineSub2);
        System.out.println("length: " + lineSub2.getLength() + " gradient: " + lineSub2.getGradient());

    }
}
