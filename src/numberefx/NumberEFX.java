package numberefx;

import java.util.Scanner;

public class NumberEFX {
    
    public static void main(String[] args) {
        //welcome the user and display the guide to using the app
        System.out.println("Welcome User \nSelect the operation(s) you'd like to perform");
        System.out.println("1: Sum");
        System.out.println("2: Product");
        System.out.println("3: Difference");
        System.out.println("4: Sum and product");
        System.out.println("5: Sum and difference");
        System.out.println("6: Product and difference");
        System.out.println("7: Sum, product and difference");
        System.out.println("Also note that you have to pass in the mathematical problem in this format: <operand>,<operand>,... e.g 6,4");
        System.out.println("Trailing commas can also be included but they'll be ignored, do not add spaces");
        
        //initialize the scanner to take input
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the problem in the requested format");
        String problem = scanner.next();
        System.out.println("Enter operation type(s) i.e. 1-7");
        int choice = scanner.nextInt();
       
        //perform necessary operations depending on user's choice
        switch(choice) {
            case 1 -> {
                solve(problem, "sum");
            }
            case 2 -> {
                solve(problem, "product");
            }
            case 3 -> {
                solve(problem, "difference");
            }
            case 4 -> {
                solve(problem, "sum");
                solve(problem, "product");
            }
            case 5 -> {
                solve(problem, "sum");
                solve(problem, "difference");
            }
            case 6 -> {
                solve(problem, "product");
                solve(problem, "difference");
            }
            case 7 -> {
                solve(problem, "sum");
                solve(problem, "product");
                solve(problem, "difference");
            }
            default -> System.out.println("Not a valid choice");
        }
    }
    
    //this handles all operations required
    static void solve(String problem, String operation) {
        String[] operands = problem.split(",");
        double result = Double.parseDouble(operands[0]);
        
        for (int i = 1; i < operands.length; i++) {
            switch (operation) {
                case "sum" -> result += Double.parseDouble(operands[i]);
                case "product" -> result *= Double.parseDouble(operands[i]);
                case "difference" -> result -= Double.parseDouble(operands[i]);
                default -> {
                }
            } 
        }
        
        switch(operation) {
            case "sum" -> {
                System.out.println("The sum is " + result);
            }
            case "product" -> {
                System.out.println("The product is " + result);
            }
            case "difference" -> {
                System.out.println("The difference is " + result);
            }
            default -> System.out.println("Not a valid operation");
        }
    }
}
