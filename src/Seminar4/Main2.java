package Seminar4;

import java.util.*;

/*
Реализовать консольное приложение, которое:
1. Принимает от пользователя и “запоминает” строки.
2. Если введено print, выводит строки так, чтобы последняя введенная
была первой в списке, а первая - последней.
3. Если введено revert, удаляет предыдущую введенную строку из памяти.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        boolean flag = true;
        while(flag) {
            String text = scanner.nextLine();
            switch (text) {
                case "print":
//                    for (int i = list.size() - 1; i >= 0; i--) {
//                        System.out.println(list.get(i)); // плохая идея. ЛинкедЛист плохо работает с индексами
//                    }
                    ListIterator<String> iterator = list.listIterator(list.size());
                    while (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                }
                    break;
                case "revert":
                    list.remove(list.size()-1);
                    break;
                case "end":
                    flag = false;
                    break;
                default:
                    list.add(text);
            }
        }
    }
}
