import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
       Map<Integer,String> m  =new HashMap<>();
       add(m);
    }
    public static void add (Map<Integer,String>map) {
        map.put(3,"First");
        map.put(4,"Second");
        map.put(1,"Third");
    }
}
