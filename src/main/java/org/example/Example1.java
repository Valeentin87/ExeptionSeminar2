package org.example;

import java.util.Scanner;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение
//        Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить
//        у пользователя ввод данных.
public class Example1 {
    public static void main(String[] args) {
        System.out.println("Hello from example1");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число с плавающей точкой");
        float num;
        try {
            num = in.nextFloat();
        } catch (Exception e){
            System.out.println("Вы ввели строку, введите заново число ");
            num = in.nextFloat();
        } finally {
            in.close();
                    }
        System.out.println("Ошибки ввода не произошло!!!");

    }
}
