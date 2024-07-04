import java.util.Scanner;

public class JavaBasicsDemo {
    public static void main(String[] args) {
        // HelloWorld
        System.out.println("Hello, World!");

        // VariableDeclaration
        int age = 25;
        Double height = 1.75;
        boolean isStudent = true;
        String name = "John Doe";

        // ArithmeticOperations and StringConcatenation
        System.out.println("Name: " + name + ", Age: " + age + ", Height: " + height + "m, Student: " + isStudent);
        System.out.println("Age in 5 years: " + (age - 5));
        System.out.println("Half of height: " + (height / 2));

        // UserInput
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your favorite number: ");
        int favoriteNumber = scanner.nextInt();

        // ConditionalStatements
        if (favoriteNumber % 2 == 0) {
            System.out.println("Your favorite number is even.");
        } else {
            System.out.println("Your favorite number is odd.");
        }

        // SwitchCase
        System.out.print("Enter a day number (1-7): ");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day number");
        }

        // ForLoop
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // WhileLoop
        System.out.println("Counting down from 5 to 1:");
        int count = 5;
        while (count > 0){
            System.out.print(count + " ");
            count--;
        }
        System.out.println();

        // DoWhileLoop
        System.out.println("Enter numbers to sum (enter 0 to finish):");
        int sum = 0;
        int number;
        do {
            number = scanner.nextInt();
            sum =+ number;
        } while (number != 0);
        System.out.println("Sum: " + sum);

        // NestedLoops
        System.out.println("Multiplication table (1-5):");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++){
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

        // ArrayDeclaration and ArrayIteration
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array Elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        scanner.close();
    }
}


