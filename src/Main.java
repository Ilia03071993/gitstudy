import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        put(m);
    }

    static void put(Map<String, Integer> map) {
        map.put("Kevin",23);
        map.put("Luisa",28);
        map.put("Rodi",13);
    }
}