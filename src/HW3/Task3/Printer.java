package HW3.Task3;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
 //'-2, -1, 0, 1, 2, 3, 4, 5'
//'10, 20, 30, 40, 50
//'1, 3, 5, 7, 9'
class Answer {
    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, arr);
        list.sort(null);
        int minValue = Collections.min(list);
        int maxValue = Collections.max(list);
        double average  = calculateAverage(list);
        System.out.println(list);
        System.out.printf("Minimum is %d\n", minValue);
        System.out.printf("Maximum is %d\n", maxValue);
        System.out.printf("Average is = %.1f", average);
    }

    private static double calculateAverage(ArrayList<Integer> list) {
        int sum = 0;
        for (int i=0; i< list.size(); i++) {
            sum += list.get(i);
        }
        double v = (double) sum / list.size();
        return v;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{1, 3, 5, 7, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer ans = new Answer();
        ans.analyzeNumbers(arr);
    }
}