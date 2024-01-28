package Seminar2;
/*
Задание №2
Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd.
Результат: a4b3cd2
 */

public class Main2 {
    public static void main(String[] args) {
        String example = "aaaabbbcdd";
        System.out.println(stringCompression(example));
    }
    static String stringCompression(String s) {
        StringBuilder compString = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                compString.append(s.charAt(i - 1));
                if (count > 1){
                    compString.append(count);
                }
                count = 1;
            }
        }
        compString.append(s.charAt(s.length()-1));
        if (count > 1){
            compString.append(count);
        }
        return compString.toString();
    }
}
