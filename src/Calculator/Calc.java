import java.util.Scanner;

public class Calc {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }
    public static void main(String[] args) {
        Calc calculator = new Calc();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a = in.nextDouble();
        System.out.print("Enter the second number: ");
        double b = in.nextDouble();

        System.out.print("Choose the operation (1 for addition, 2 for subtraction, 3 for multiplication, 4 for division, 5 for power): ");
        int operation = in.nextInt();

        double result = 0;
        switch (operation) {
            case 1:
                result = calculator.add(a, b);
                break;
            case 2:
                result = calculator.subtract(a, b);
                break;
            case 3:
                result = calculator.multiply(a, b);
                break;
            case 4:
                result = calculator.divide(a, b);
                break;
            case 5:
                result = calculator.power(a, b);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }

        System.out.println("The result is: " + result);
        in.close();
    }
}
