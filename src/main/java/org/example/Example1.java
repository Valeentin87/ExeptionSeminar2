package org.example;

import java.util.Scanner;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение
//        Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить
//        у пользователя ввод данных.
public class Example1 {

    public static void main(String[] args) {

        System.out.print("input: ");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a whole number.");
            String input = sc.next();
            int intInputValue = 0;
            try {
                intInputValue = Integer.parseInt(input);
                System.out.println("Correct input, exit: " + Float.valueOf(intInputValue));

                break;
            } catch (NumberFormatException ne) {
                System.out.println("Input is not a number, continue");
            }
        }
    }
}