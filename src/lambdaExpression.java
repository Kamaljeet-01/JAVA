// Implementation of Lambda Expression

@FunctionalInterface
interface Operation {
    int apply(int a, int b);
}
public class lambdaExpression {
    public static void main(String[] args) {

        // Lambda expression for addition
        Operation add = (a, b) -> a + b;

        // Lambda expression for multiplication
        Operation multiply = (a, b) -> a * b;

        System.out.println("Addition: " + add.apply(5, 3));
        System.out.println("Multiplication: " + multiply.apply(5, 3));
    }
}
