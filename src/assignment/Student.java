package assignment;
//10.
public class Student {
	    int roll_no;
	    long phone_no;
	    String address;

	    public static void main(String[] args) {
	        Student s1 = new Student();
	        Student s2 = new Student();

	        s1.roll_no = 1;
	        s1.phone_no = 9876543210L;
	        s1.address = "Kozhikode";
	        
	        s2.roll_no = 2;
	        s2.phone_no = 9123456780L;
	        s2.address = "Kochi";

	        System.out.println("Sam Details:");
	        System.out.println("Roll No: " + s1.roll_no);
	        System.out.println("Phone No: " + s1.phone_no);
	        System.out.println("Address: " + s1.address);

	        System.out.println();

	        System.out.println("John Details:");
	        System.out.println("Roll No: " + s2.roll_no);
	        System.out.println("Phone No: " + s2.phone_no);
	        System.out.println("Address: " + s2.address);
	    }
	}