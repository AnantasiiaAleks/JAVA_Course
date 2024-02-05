package Seminar4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
Сравните с предыдущим.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        test(list1);
        test(list2);
        test2(list1);
        test2(list2);
        test3(list1);
        test3(list2);
    }

    private static void test(List<Integer> list) {
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        long timeFinish = System.currentTimeMillis();
        System.out.println(list.getClass().getSimpleName() + ": " + (timeFinish - timeStart));
    }

    private static void test2(List<Integer> list) {
        long timeStart = System.currentTimeMillis();
        long sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        long timeFinish = System.currentTimeMillis();
        System.out.println(list.getClass().getSimpleName() + ": " + (timeFinish - timeStart));
    }

    private static void test3(List<Integer> list) {
        long timeStart = System.currentTimeMillis();
        long sum = 0;
        for (int i: list) {
            sum += i;
        }
        long timeFinish = System.currentTimeMillis();
        System.out.println(list.getClass().getSimpleName() + " (с итератором): " + (timeFinish - timeStart));
    }
}
