package Seminar5.Task1;

import java.util.HashMap;
import java.util.Map;

public class Passports {
    Map<String, String> map = new HashMap<>();

    void add (String passNum, String name){
        map.put(passNum, name);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String element: map.keySet()) {
            sb.append(element);
            sb.append(": ");
            sb.append(map.get(element));
            sb.append("\n");
        }
        return sb.toString();
    }

    String findByName (String name) {
        StringBuilder sb = new StringBuilder();
        for (String element: map.keySet()) {
            if (map.get(element).equals(name)) {
                sb.append(element);
                sb.append(": ");
                sb.append(map.get(element));
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
