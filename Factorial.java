package Javatesting;

import java.util.Scanner;

public class Factorial {
    private static Scanner input;

	public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        long fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial: " + fact);
    }
}
