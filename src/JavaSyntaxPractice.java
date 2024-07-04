import java.util.Scanner;
import java.util.Random;

public class JavaSyntaxPractice {
    private static Scanner scanner = new Scanner(System.in);
    private static int score = 0;
    private static int totalQuestions = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Java Syntax Practice!");
        System.out.println("This session will take about 30 minutes. Let's begin!\n");

        practiceVariableDeclaration();
        practiceArithmeticOperations();
        practiceConditionalStatements();
        practiceLoops();
        practiceArrays();
        practiceMethodDeclaration();
        practiceClassDeclaration();
        practiceExceptionHandling();
        practiceStringManipulation();

        displayFinalScore();
        scanner.close();
    }

    private static void practiceVariableDeclaration() {
        System.out.println("1. Variable Declaration Practice");
        askQuestion("Declare an integer variable named 'age' and assign it the value 25:", "int age = 25;");
        askQuestion("Declare a double variable named 'price' with the value 19.99:", "double price = 19.99;");
        askQuestion("Declare a boolean variable named 'isJavaFun' and set it to true:", "boolean isJavaFun = true;");
        askQuestion("Declare a String variable named 'name' with the value \"John\":", "String name = \"John\";");
        System.out.println();
    }

    private static void practiceArithmeticOperations() {
        System.out.println("2. Arithmetic Operations Practice");
        askQuestion("Write an expression to add 5 and 3:", "5 + 3");
        askQuestion("Write an expression to subtract 10 from 20:", "20 - 10");
        askQuestion("Write an expression to multiply 4 by 6:", "4 * 6");
        askQuestion("Write an expression to divide 15 by 3:", "15 / 3");
        askQuestion("Write an expression to get the remainder of 17 divided by 5:", "17 % 5");
        System.out.println();
    }

    private static void practiceConditionalStatements() {
        System.out.println("3. Conditional Statements Practice");
        askQuestion("Write an if statement to check if 'x' is greater than 10:",
                "if (x > 10) {\n    // code\n}");
        askQuestion("Write an if-else statement to check if 'age' is at least 18:",
                "if (age >= 18) {\n    // code for adults\n} else {\n    // code for minors\n}");
        askQuestion("Write a switch statement for a variable 'day' with cases for 1, 2, and 3:",
                "switch (day) {\n    case 1:\n        // code\n        break;\n    case 2:\n        // code\n        break;\n    case 3:\n        // code\n        break;\n    default:\n        // code\n}");
        System.out.println();
    }

    private static void practiceLoops() {
        System.out.println("4. Loops Practice");
        askQuestion("Write a for loop that iterates 5 times, using 'i' as the counter:",
                "for (int i = 0; i < 5; i++) {\n    // code\n}");
        askQuestion("Write a while loop that continues while 'x' is less than 10:",
                "while (x < 10) {\n    // code\n    x++;\n}");
        askQuestion("Write a do-while loop that executes at least once:",
                "do {\n    // code\n} while (condition);");
        System.out.println();
    }

    private static void practiceArrays() {
        System.out.println("5. Arrays Practice");
        askQuestion("Declare an integer array named 'numbers' with 5 elements:",
                "int[] numbers = new int[5];");
        askQuestion("Initialize an array with the values 1, 2, 3, 4, 5:",
                "int[] array = {1, 2, 3, 4, 5};");
        askQuestion("Write a for-each loop to iterate through an array 'arr':",
                "for (int element : arr) {\n    // code\n}");
        System.out.println();
    }

    private static void practiceMethodDeclaration() {
        System.out.println("6. Method Declaration Practice");
        askQuestion("Declare a public static method named 'sum' that takes two integers and returns their sum:",
                "public static int sum(int a, int b) {\n    return a + b;\n}");
        askQuestion("Declare a private method named 'printMessage' that takes a String parameter and returns void:",
                "private void printMessage(String message) {\n    // code\n}");
        System.out.println();
    }

    private static void practiceClassDeclaration() {
        System.out.println("7. Class Declaration Practice");
        askQuestion("Declare a public class named 'Person' with private fields 'name' and 'age':",
                "public class Person {\n    private String name;\n    private int age;\n    // constructor and methods\n}");
        askQuestion("Write a constructor for the 'Person' class:",
                "public Person(String name, int age) {\n    this.name = name;\n    this.age = age;\n}");
        System.out.println();
    }

    private static void practiceExceptionHandling() {
        System.out.println("8. Exception Handling Practice");
        askQuestion("Write a try-catch block to handle an ArithmeticException:",
                "try {\n    // code that might throw an exception\n} catch (ArithmeticException e) {\n    // handle the exception\n}");
        askQuestion("Write a try-catch-finally block:",
                "try {\n    // code\n} catch (Exception e) {\n    // handle exception\n} finally {\n    // always executed code\n}");
        System.out.println();
    }

    private static void practiceStringManipulation() {
        System.out.println("9. String Manipulation Practice");
        askQuestion("Write code to concatenate two strings 'str1' and 'str2':",
                "String result = str1 + str2;");
        askQuestion("Write code to get the length of a string 'str':",
                "int length = str.length();");
        askQuestion("Write code to convert a string 'str' to uppercase:",
                "String upperCase = str.toUpperCase();");
        System.out.println();
    }

    private static void askQuestion(String question, String correctAnswer) {
        System.out.println(question);
        String userAnswer = scanner.nextLine().trim();
        totalQuestions++;
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is:");
            System.out.println(correctAnswer);
        }
        System.out.println();
    }

    private static void displayFinalScore() {
        System.out.println("Practice session completed!");
        System.out.println("Your score: " + score + " out of " + totalQuestions);
        double percentage = (double) score / totalQuestions * 100;
        System.out.printf("Percentage: %.1f%%\n", percentage);

        if (percentage >= 90) {
            System.out.println("Excellent! You have a strong grasp of Java syntax.");
        } else if (percentage >= 70) {
            System.out.println("Good job! You have a solid understanding of Java syntax, but there's room for improvement.");
        } else {
            System.out.println("You might need more practice with Java syntax. Keep studying and practicing!");
        }
    }
}