package Exceptions_HW2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input number: ");
            d = scanner.nextInt();
            scanner.close();
            int[] Array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            double catchedRes1 = Array[8] / d;
            System.out.println(("catchedRes1 = " + catchedRes1));
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}


