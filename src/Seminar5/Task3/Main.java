package Seminar5.Task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [a+(1]*3) - ложь
Пример 4: [6+(3*3)] - истина
Пример 5: {a}[+]{(d*3)} - истина
Пример 6: <{a}+{(d*3)}> - истина
Пример 7: {a+]}{(d*3)} - ложь
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(checkBrackets("a+(d*3)"));
        System.out.println(checkBrackets("[6+(3*3)]"));
        System.out.println(checkBrackets("{a}[+]{(d*3)}"));
        System.out.println(checkBrackets("<{a}+{(d*3)}>"));
        System.out.println(checkBrackets("a+(d*3))"));
        System.out.println(checkBrackets("[a+(1*3)"));
        System.out.println(checkBrackets("[a+(1]*3)"));
        System.out.println(checkBrackets("{a+]}{(d*3)}"));
    }

    static boolean checkBrackets(String str) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        map.put('<', '>');
        for (Character s : str.toCharArray()) {
            if (map.containsKey(s)) {
                stack.add(s);
            } else if (map.containsValue(s)) {
                if (stack.empty() || map.get(stack.pop()) != s) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
