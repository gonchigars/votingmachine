import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class AdvancedJavaBasics {
    public static void main(String[] args) {
        System.out.println("Welcome to Advanced Java Basics!");

        // Variable declarations and initializations
        int age = 30;
        double height = 1.80;
        boolean isEmployed = true;
        String name = "John Doe";
        float PI = 3.14159f;

        // Array and ArrayList
        int[] numbers = {1, 2, 3, 4, 5};
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // HashMap
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 35);

        // User input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your favorite color: ");
        String favoriteColor = scanner.nextLine();

        // Conditional statements
        if (favoriteColor == "Blue") {
            System.out.println("Blue is a cool color!");
        } else if (favoriteColor == "Red") {
            System.out.println("Red is a warm color!");
        } else {
            System.out.println(favoriteColor + " is a nice color!");
        }

        // Switch statement
        System.out.print("Enter a number (1-3): ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You chose one.");
                break;
            case 2:
                System.out.println("You chose two.");
                break;
            case 3:
                System.out.println("You chose three.");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        // Loops
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int count = 0;
        while (count < 5) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();

        do {
            System.out.print("Enter a number (0 to exit): ");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
        } while (true);

        // Method calls
        int sum = addNumbers(5, 10);
        System.out.println("Sum: " + sum);

        printMessage("Hello, World!");

        // Exception handling
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Division operation completed.");
        }

        // Class instantiation
        Person person = new Person("Alice", 25);
        person.introduce();

        scanner.close();
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
   
}