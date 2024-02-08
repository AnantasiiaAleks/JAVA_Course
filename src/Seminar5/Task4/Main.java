package Seminar5.Task4;

import java.util.*;

/*
Взять набор строк, например

Мороз и солнце день чудесный
Еще ты дремлешь друг прелестный
Пора красавица проснись.

Написать метод, который отсортирует эти слова по длине с помощью TreeMap.
Слова с одинаковой длиной не должны “потеряться”.
 */
public class Main {
    public static void main(String[] args) {
        String s = "Мороз и солнце день чудесный\n" +
                "Еще ты дремлешь друг прелестный\n" +
                "Пора красавица проснись.";
        sortByLenght(s);
    }

    static void sortByLenght(String s) {
        Map<Integer, List<String>> treeMap = new TreeMap<>(Comparator.reverseOrder());  //в обратном порядке
        s = s.replace(".", "");
        s = s.replace("\n", " ");
        String[] words = s.split(" ");
        for (String word: words) {
            int len = word.length();
            if (treeMap.containsKey(len)) {
                List<String> list = treeMap.get(len);
                list.add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                treeMap.put(len, list);
            }
        }
        System.out.println(treeMap);
    }
}
