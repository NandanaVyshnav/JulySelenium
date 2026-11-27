//6
package assignment;

class Shape1 {

    public double area() {
        return 0;
    }
}

class Circle1 extends Shape1 {

    double radius;

    Circle1(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle1 extends Shape1 {

    double length;
    double breadth;

    Rectangle1(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }
}

class Triangle1 extends Shape1 {

    double base;
    double height;

    Triangle1(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

public class OOP6 {

    public static void main(String[] args) {

        Shape1 s1 = new Circle1(5);
        Shape1 s2 = new Rectangle1(10, 5);
        Shape1 s3 = new Triangle1(8, 6);

        System.out.println("Circle area : " + s1.area());
        System.out.println("Rectangle area : " + s2.area());
        System.out.println("Triangle area : " + s3.area());

    }
}
