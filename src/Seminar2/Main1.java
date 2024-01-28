package Seminar2;
/*
Задание №1
Дано четное число N (>0) и символы c1 и c2.
Написать метод, который вернет строку длины N, которая
состоит из чередующихся символов c1 и c2, начиная с c1.
 */
public class Main1 {
    public static void main(String[] args) {
        int length = 10;
        char c1 = 'a';
        char c2 = 'b';
        System.out.println(builder(length, c1, c2));

    }
    static String builder(int length, char c1, char c2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                result.append(c1);
            } else {
                result.append(c2);
            }
        }
        return result.toString();
    }
}
