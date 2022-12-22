package exercise2_1;

public class TestLine {
    public static void main(String[] args) {
        Line line1 = new Line(0,0,3,4);
        System.out.println(line1);

        Point p1 = new Point(5,6);
        Point p2 = new Point(3,4);
        Line line2 = new Line(p1,p2);
        System.out.println(line2);

        line1.setBeginXY(1,1);
        line1.setEndXY(2,1);
        System.out.println(line1);
        System.out.println("length: " + line1.getLength() +" gradient: " + line1.getGradient());
    }
}
