import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("NotPredator");
        Animal animal1 = new Animal("Predator");
        Animal animal2 = new Animal("NotPredator");
        Animal animal3 = new Animal("Predator");
        Map<String, Animal> map = new HashMap();
        map.put("Animal",animal);
        map.put("Animal1",animal1);
        map.put("Animal2",animal2);
        map.put("Animal3",animal3);

        Map<String,Animal> map1 = new TreeMap<>();
        Map<String,Animal> map2 = new LinkedHashMap<>();

        map.forEach((k,v) -> {
            if (v.type == "Predator") {
                map1.put(k,v);
            }
            if (v.type == "NotPredator") {
                map2.put(k,v);
            }
        });
        map1.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " = " + entry.getValue());
        });
        System.out.println("-----");
        map2.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " = " + entry.getValue());
        });
       }
}
