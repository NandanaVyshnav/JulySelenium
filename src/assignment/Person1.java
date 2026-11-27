//4.
package assignment;
 class Person {
	private String name;
	private int age;
	private String country;

	//Setter Methods
	public void setName(String n) {
		name =n;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public void setCountry(String c){
		country = c;
	}
	
	//Getter Method
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCountry() {
		return country;
	}
}

public class Person1{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person();
		p.setName("Arjun");
		p.setAge(28);
		p.setCountry("India");
		
		System.out.println("Name : "+p.getName());
		System.out.println("Age : "+p.getAge());
		System.out.println("Country : "+p.getCountry());
	}

}
