import java.util.*;
public class calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double a = input.nextDouble();

        System.out.print("Enter number 2: ");
        double b = input.nextDouble();

        System.out.print("Enter operation (+, -, , /): ");
        char op = input.next().charAt(0);

        double result = 0;

        if (op == '+') {
            result = a + b;
        }

        if (op == '-') {
            result = a - b;
        }

        if (op == '*') {
            result = a * b;
        }

        if (op == '/') {
            result = a / b;
        }

        System.out.println("Result = " + result);
    }
}
















