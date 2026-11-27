package assignment;

 class Member {
	String name;
	int age;
	String phoneNumber;
	String address;
	double salary;
	
	public void Salary() {
		System.out.println("Salary: "+salary);
	}
}

class Employee extends Member{
	
	 String specialization;
 }

class Manager extends Member{
	
	String department;
}
public class MemberDemo{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		emp.name = "Arun";
		emp.age = 25;
		emp.phoneNumber = "9876543210";
		emp.address = "Kochi";
		emp.salary = 30000;
		emp.specialization = "Java Developer";
		
		System.out.println("------Employee Details-----");
		System.out.println("Name : "+emp.name);
		System.out.println("Age : "+emp.age);
		System.out.println("Phone Number: "+emp.phoneNumber);
		System.out.println("Address : "+emp.address);
		System.out.println("Specialization : "+emp.specialization);
		emp.Salary();
		
		Manager mgr = new Manager();
		
		mgr.name = "Rahul";
		mgr.age = 35;
		mgr.phoneNumber = "9123456780";
		mgr.address ="Calicut";
		mgr.salary = 60000;
		mgr.department = "IT Deaprtment";
		
		System.out.println("\n----- Manager Details -----");
        System.out.println("Name: " + mgr.name);
        System.out.println("Age: " + mgr.age);
        System.out.println("Phone Number: " + mgr.phoneNumber);
        System.out.println("Address: " + mgr.address);
        mgr.Salary();
        System.out.println("Department: " + mgr.department);
    }
}
