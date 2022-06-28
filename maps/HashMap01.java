package maps;

import java.util.HashMap;
import java.util.Map;

public class HashMap01 {
    
    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<Integer, String>();
        
        names.put(0, "Robson");
        names.put(1, "Ricardo");
        names.put(2, "Rodrigo");
        names.put(3, "Ryan");

        System.out.println(names);
        System.out.println(names.keySet());
        System.out.println(names.values());
        System.out.println(names.entrySet());

        System.out.println(names.remove(3));
        System.out.println(names);

        System.out.println(names.remove(2, "Ricardo"));
        System.out.println(names);
        
        System.out.println(names.remove(2, "Rodrigo"));
        System.out.println(names);

    }
}
