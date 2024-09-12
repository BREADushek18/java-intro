package org.example;

import java.util.Scanner;

public class EquationRoots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите аргумент a:");
        double numberA = scanner.nextDouble();
        System.out.println("Введите аргумент b:");
        double numberB = scanner.nextDouble();
        System.out.println("Введите аргумент c:");
        double numberC = scanner.nextDouble();

        String result = findRoots(numberA, numberB, numberC);
        System.out.println(result);

        scanner.close();
    }

    public static String findRoots(double numberA, double numberB, double numberC) {
        double discriminant = numberB * numberB - 4 * numberA * numberC;
        if (discriminant > 0) {
            double numberX1 = (-numberB + Math.sqrt(discriminant)) / (2 * numberA);
            double numberX2 = (-numberB - Math.sqrt(discriminant)) / (2 * numberA);
            return "Корни уравнения: x1=" + numberX1 + " x2=" + numberX2;
        } else if (discriminant == 0) {
            double numberX1 = -numberB / (2 * numberA);
            return "Корень уравнения: x1=" + numberX1;
        } else {
            return "Нет вещественных корней";
        }
    }
}
