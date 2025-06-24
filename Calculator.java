package Javatesting;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter first number: ");
			double a = input.nextDouble();
			System.out.print("Enter second number: ");
			double b = input.nextDouble();
			System.out.print("Choose operation (+, -, *, /): ");
			char op = input.next().charAt(0);
			double result;

			switch (op) {
			    case '+': result = a + b; break;
			    case '-': result = a - b; break;
			    case '*': result = a * b; break;
			    case '/': result = a / b; break;
			    default: System.out.println("Invalid operation!"); return;
			}

			System.out.println("Result: " + result);
		}
    }
}