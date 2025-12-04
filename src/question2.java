// Question :: Implement Constructor Chaining With super() and this()

class Person {

    String name;
    int age;

    Person() {
        System.out.println("Person default constructor called");
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person parameterized constructor called");
    }
}

class Employee extends Person {
    String department;

    // Constructor 1: Calls another constructor of Employee using this()
    Employee() {
        this("Unknown", 0, "General");
        System.out.println("Employee default constructor called");
    }

    // Constructor 2: Calls Parent constructor using super()
    Employee(String name, int age, String department) {
        super(name, age); // Constructor chaining to parent class
        this.department = department;
        System.out.println("Employee parameterized constructor called");
    }
}

public class question2 {
    public static void main(String[] args) {
        System.out.println("Creating Employee object...\n");

        Employee emp = new Employee();
    }
}
