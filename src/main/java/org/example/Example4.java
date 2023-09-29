//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю
// должно показаться сообщение, что пустые строки вводить нельзя.

package org.example;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение: ");
        String message;
        try {
            message = sc.nextLine();
            stringInput(message);
            System.out.println("Введенная строка корректна!!!");
        } catch (NullStringExeption e) {
            System.out.println("Некорректный ввод: " + e.getMessage());
        }
        finally {
            sc.close();
        }
    }

    public static void stringInput(String input) throws NullStringExeption {
        if (input == null || input.isEmpty()) {
            throw new NullStringExeption("Входная строка не может быть null или пустой");
        }
    }
}
