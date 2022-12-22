package exercise1_3;

public class TestMain {
    public static void main(String[] args) {
        Point2D point2D1 = new Point2D(1, 2);
        System.out.println(point2D1.toString());
        point2D1.setXY(7, 8);
        System.out.println("(x,y)= (" + point2D1.getX() + "," + point2D1.getY() + ")");
        Point3D point3D1 = new Point3D(3, 4, 5);
        System.out.println(point3D1.toString());
        point3D1.setXYZ(1, 2, 3);
        System.out.println("(x,y,z)= (" + point3D1.getX() + "," + point3D1.getY() + "," + point3D1.getZ() + ")");
        for (int i = 0 ; i < point3D1.getXYZ().length; i++) {
            System.out.println(point3D1.getXYZ()[i]);
        }
    }
}
