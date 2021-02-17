package kroger.p1;

import java.util.HashMap;

public class HashMapScenario {
    public static void main(String[] argv) {
        /* string key ops */
        HashMap<String, Integer> stringKeyHashMap =
                new HashMap<>();
        stringKeyHashMap.put("A", Integer.valueOf(1));
        stringKeyHashMap.put("A", Integer.valueOf(2));

        /*
         * custom key ops
         */
        HashMap<Key, Integer> customKeyHashMap =
                new HashMap<>();

        Key key1A = new Key("A");
        Key key2A = new Key("A");

        customKeyHashMap.put(key1A, Integer.valueOf(1));
        customKeyHashMap.put(key2A, Integer.valueOf(2));

        System.out.println(String.format(
                "stringKey: %S ; customKey: %s",
                stringKeyHashMap.get("A"),
                customKeyHashMap.get(key1A)));

    }
}
class Key {
    String keyValue;
    public Key(String keyValue){
        this.keyValue =keyValue;
    }
}

//stringKey: 2 ; customKey: 1