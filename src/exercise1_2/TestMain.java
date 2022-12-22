package exercise1_2;

public class TestMain {
    public static void main(String[] args) {
        Student student1 = new Student("John", "The UK", "Data", 2022, 500);
        System.out.println(student1.toString());
        student1.setFee(1000);
        System.out.println("name:" + student1.getName() + " address:" + student1.getAddress() + " year:" + student1.getYear() + " fee:" + student1.getFee());
        Staff staff1 = new Staff("Harry", "The US", "A", 1000);
        staff1.setSchool("B");
        System.out.println("name:" + staff1.getName() + " address:" + staff1.getAddress() + " pay:" + staff1.getPay());
        System.out.println(staff1.toString());
    }
}
