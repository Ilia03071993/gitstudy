import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
       Map<String,Integer> map1  =new HashMap<>();
       add(map1);
    }
    public static void add (Map<String,Integer>map) {
        map.put("First",1);
        map.put("Second",2);
        map.put("Third",3);
    }

}
