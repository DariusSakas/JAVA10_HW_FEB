package HashMapPart;

import java.util.HashMap;

public class HashMapPartMain {
    public static void main(String[] args) {

        HashMapEditor hashMapEditor = new HashMapEditor();

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        hashMap.put(4, "Four");


        hashMapEditor.checkIfContainsValue(hashMap);
    }
}
