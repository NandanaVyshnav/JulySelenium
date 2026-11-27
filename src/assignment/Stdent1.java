
package assignment;

public class Stdent1 {

    int roll_no;
    String name;

    // Parameterized constructor
    Stdent1(int r, String n) {
        roll_no = r;
        name = n;
    }

    // Copy constructor
    Stdent1(Stdent1 s) {
        roll_no = s.roll_no;
        name = s.name;
    }

    public static void main(String[] args) {

        Stdent1 s1 = new Stdent1(1, "John");

        Stdent1 s2 = new Stdent1(s1);

        System.out.println("First Object:");
        System.out.println("Roll No: " + s1.roll_no);
        System.out.println("Name: " + s1.name);

        System.out.println("Second Object:");
        System.out.println("Roll No: " + s2.roll_no);
        System.out.println("Name: " + s2.name);
    }
}
