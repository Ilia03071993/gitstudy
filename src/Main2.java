import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
       Map<Integer,String> map  =new HashMap<>();
       add(map);
    }
    public static void add (Map<Integer,String>map) {
        map.put(1,"First");
        map.put(2,"Second");
        map.put(3,"Third");
    }
}
