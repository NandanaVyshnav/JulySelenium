package assignment;

public class Circle2 {
	    double radius;

	    Circle2(double r) {
	        radius = r;
	    }

	    double area() {
	        return 3.14 * radius * radius;
	    }

	    void display() {
	        System.out.println("Radius: " + radius);
	        System.out.println("Area: " + area());
	    }

	    public static void main(String[] args) {
	        Circle2 c1 = new Circle2(2.0);
	        Circle2 c2 = new Circle2(12);
	        Circle2 c3 = new Circle2(24);

	        c1.display();
	        c2.display();
	        c3.display();
	    }
	}

