package Seminar1;
/*
Во фразе "Добро пожаловать на курс по Java" переставить слова
в обратном порядке.
 */
public class Main4 {
    public static void main(String[] args) {
        String s = "Добро пожаловать на курс по Java";
        String[] arr_s = s.split(" ");
        String new_s = "";
        for (int i = arr_s.length - 1; i >= 0; i--) {
            new_s += arr_s[i] + " ";
        }
        System.out.println(new_s.trim());
    }
}
