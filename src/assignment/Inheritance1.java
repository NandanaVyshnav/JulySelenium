//2.
package assignment;

class Parent1 {

    void displayParent() {
        System.out.println("This is parent class");
    }
}

class Child3 extends Parent1 {

    void displayChild() {
        System.out.println("This is child class");
    }
}

public class Inheritance1 {

    public static void main(String[] args) {
        Parent1 p = new Parent1();

        Child3 c = new Child3();
        p.displayParent();
        c.displayChild();
        c.displayParent();
    }
}

