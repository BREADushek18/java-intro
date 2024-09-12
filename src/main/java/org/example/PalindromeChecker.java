package org.example;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        boolean isPalindrome = checkPalindrome(input);

        if (isPalindrome) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом, увы(");
        }

        scanner.close();
    }

    public static boolean checkPalindrome(String str) {
        // Убираем пробелы и приводим к нижнему регистру
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Создаем обратную строку
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();

        // Сравниваем очищенную строку с её обратной версией
        return cleanedStr.equals(reversedStr);
    }
}
