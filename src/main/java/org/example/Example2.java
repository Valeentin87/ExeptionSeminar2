package org.example;

import java.util.ArrayList;

public class Example2 {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        try {
            int d = 1;
            double catchedRes1 = intArray[11] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unsupported index number of intArray!!! ");
        }

    }
}
