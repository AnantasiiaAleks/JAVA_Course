package Seminar4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
Реализовать консольное приложение, которое:
1. Принимает от пользователя и “запоминает” строки.
2. Если введено print, выводит строки так, чтобы последняя введенная
была первой в списке, а первая - последней.
3. Если введено revert, удаляет предыдущую введенную строку из памяти.
 */
public class Main2var2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        boolean work = true;
        while(work) {
            String line = scanner.nextLine();
            switch (line) {
                case "print":
                    for (String s: list) {
                        System.out.println(s);
                    }
                    break;
                case "revert":
                    list.remove(0);
                    break;
                case "end":
                    work = false;
                    break;
                default:
                    list.add(0, line);
            }
        }
    }
}
