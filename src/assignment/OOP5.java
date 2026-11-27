//5
package assignment;
class Shape{
	public double calculateArea() {
		return 0;
	}
}
class Circle extends Shape{
	double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	@Override
	public double calculateArea() {
		return 3.14*radius*radius;
	}
}
class Rectangle extends Shape{
	double Length;
	double Breadth;
	
	Rectangle (double Length,double Breadth){
		this.Length = Length;
		this.Breadth = Breadth;
	}
	@Override
	public double calculateArea() {
		return Length*Breadth;
	}
}
class Triangle extends Shape{
	double base;
	double height;
	
	Triangle(double base,double height){
		this.base = base;
		this.height =height;
	}
	@Override
	public double calculateArea() {
		return 0.5*base*height;
	}
}

public class OOP5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2 c = new Circle2(5);
		Rectangle r = new Rectangle (10,5);
		Triangle t = new Triangle(8,6);
		
		System.out.println("Circle Area : "+c.calculateArea());
		System.out.println("Rectangle Area : "+r.calculateArea());
		System.out.println("Triangle Area : "+t.calculateArea());

	}

}
