package Exceptions_HW2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws Exception {
        String d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");
        d = scanner.nextLine();
        emptyString(d);
        scanner.close();
    }

    public static String emptyString(String arg) throws Exception {
        if (arg == "")
            throw new Exception("No empty strings");
        return arg;
    }
}