package org.example;

import java.util.Scanner;

public class CalculationAmount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double result = findAmount();
        System.out.println(result);

        scanner.close();
    }

    public static double findAmount() {
        int numberN = 2;
        double amount = 0;
        double currentMember; // Переменная для текущего члена ряда

        do {
            currentMember = 1.0 / (numberN * numberN + numberN - 2);
            amount += currentMember;
            numberN++;
        } while (currentMember >= 0.000001); // Проверяем текущий член

        return amount;
    }
}
