// Program to demonstrate Inner Class in Java

class Outer {
    private String message = "Hello from Outer Class";

    // Inner Class
    class Inner {
        void display() {
            System.out.println("Inner accessing: " + message);
        }
    }
}

public class innerClass {
    public static void main(String[] args) {

        Outer obj1 = new Outer();

        // Creating object of inner class using outer object
        Outer.Inner obj2 = obj1.new Inner();

        obj2.display();
    }
}
