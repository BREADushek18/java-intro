package org.example;

import java.util.Scanner;

class Pair {
    Double first;
    Double second;

    public Pair(Double first, Double second) {
        this.first = first;
        this.second = second;
    }
}

public class EquationRoots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите аргумент a:");
        double numberA = scanner.nextDouble();
        System.out.println("Введите аргумент b:");
        double numberB = scanner.nextDouble();
        System.out.println("Введите аргумент c:");
        double numberC = scanner.nextDouble();

        Pair result = findRoots(numberA, numberB, numberC);
        printResult(result);

        scanner.close();
    }

    public static Pair findRoots(double numberA, double numberB, double numberC) {
        double discriminant = numberB * numberB - 4 * numberA * numberC;
        if (discriminant > 0) {
            double numberX1 = (-numberB + Math.sqrt(discriminant)) / (2 * numberA);
            double numberX2 = (-numberB - Math.sqrt(discriminant)) / (2 * numberA);
            return new Pair(numberX1, numberX2);
        } else if (discriminant == 0) {
            double numberX1 = -numberB / (2 * numberA);
            return new Pair(numberX1, null);
        } else {
            return new Pair(null, null); // Нет вещественных корней
        }
    }

    public static void printResult(Pair result) {
        if (result.first != null && result.second != null) {
            System.out.println("Корни уравнения: x1=" + result.first + " x2=" + result.second);
        } else if (result.first != null) {
            System.out.println("Корень уравнения: x1=" + result.first);
        } else {
            System.out.println("Нет вещественных корней");
        }
    }
}
