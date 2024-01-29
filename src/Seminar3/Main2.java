package Seminar3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/*
Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.
 */
public class Main2 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("Hello");
        list.add(6);
        list.add(999);
        list.add("234");
        list.add(4);
        list.add(null);
        list.add(true);
        list.add(3.14);

//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) instanceof  Integer) {
//                list.remove(i--);
////                i--;
//            }
//        }
//
//        Iterator<Object> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            if (iterator.next() instanceof Integer) {
//                iterator.remove();
//            }
//        }

        list.removeIf(o -> o instanceof Integer);
        System.out.println(list);
    }
}
