package Exceptions_HW2;

import java.util.InputMismatchException;
import java.util.Scanner;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное
// значение.Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно
// запросить у пользователя ввод данных.

public class Task1 {
    public static void main(String[] args) {
        System.out.println(floatNumber());
    }

    public static float floatNumber() {
        float num = 0;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Input float number: ");
                num = scan.nextFloat();
                scan.close();
            } catch (InputMismatchException e) {
                System.out.println("Неверный символ, введите ещё");
            }
        } while (num == 0);
        return num;
    }
}

