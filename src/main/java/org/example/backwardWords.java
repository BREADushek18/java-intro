package org.example;

public class backwardWords {
    public static String backwardWord(String backward) {
        int length = backward.length();
        StringBuilder backwardWord = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            backwardWord.append(backward.charAt(i));
        }
        return backwardWord.toString();
    }

    public static void main(String[] args) {
        String backward = "make install";
        System.out.println(backwardWord(backward));
    }
}
