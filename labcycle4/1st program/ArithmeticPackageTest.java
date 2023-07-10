import java.util.Scanner;
import com.arithmetic.*;

 class ArithmeticMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the program...");
                break;
            }

            System.out.print("Enter number 1: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter number 2: ");
            double num2 = scanner.nextDouble();

            ArithmeticOperation operation;
            double result;

            switch (choice) {
                case 1:
                    operation = new Addition();
                    result = operation.calculate(num1, num2);
                    System.out.println("Sum: " + result);
                    break;
                case 2:
                    operation = new Subtraction();
                    result = operation.calculate(num1, num2);
                    System.out.println("Difference: " + result);
                    break;
                case 3:
                    operation = new Multiplication();
                    result = operation.calculate(num1, num2);
                    System.out.println("Product: " + result);
                    break;
                case 4:
                    operation = new Division();
                    result = operation.calculate(num1, num2);
                    System.out.println("Quotient: " + result);
                  
                    break;
                default:
                    System.out.println("Invalid choice! lease try again.");
            }

            System.out.println();
        }

    }
}

