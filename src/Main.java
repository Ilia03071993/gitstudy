import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> m1 =new TreeMap<>();
        Map<String, Integer> m2 = new HashMap<>();
        put(m1);

    }

    static void put(Map<String, Integer> map) {
        map.put("Kevin",23);
        map.put("Luisa",28);
        map.put("Rodi",13);
    }
}