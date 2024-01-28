package Seminar2;

import java.util.Scanner;

/*
Задание №3
Напишите метод, который принимает на вход строку (String) и
определяет является ли строка палиндромом (возвращает
boolean значение).
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Жду Вашу строку");
        String inputString = scanner.nextLine();
        System.out.println(isPalyndrom(inputString));
    }

    static boolean isPalyndrom(String s) {
        s = s.toLowerCase();
        s = s.replace(" ", "");
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}