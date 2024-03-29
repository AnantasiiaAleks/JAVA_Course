package Seminar6.Task1;

import java.util.*;

/*
1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.
2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.
3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] arr = {4, 5, 1, 2, 3, 2, 6, 3};

        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr)); // хранит данные в рандомном виде,
        // но для чисел упорядочивает
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr)); // хранит данные в порядке передачи
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(arr)); // упорядочивает

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }
}
