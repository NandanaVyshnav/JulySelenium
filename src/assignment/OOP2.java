package assignment;

class Parent{
	public void parentclass() {
		System.out.println("This is Parent Class");
	}
}

class Child extends Parent{
	public void childclass(){
		System.out.println("This is Child Class");
	}
}
public class OOP2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p = new Parent();
		p.parentclass();
		
		Child ch = new Child();
		ch.parentclass();
		ch.childclass();

	}
}
