package collectionsexample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExample {

    public static void demoHashMap() {
        // Create a HashMap of Integer and String
        System.out.println("--Start Demonstrating HashMap--");
        HashMap<Integer, String> students = new HashMap<>();

        // Add key-value pairs
        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(3, "Charlie");

        // Access value
        System.out.println(students.get(2)); // Output: Bob

        // Iterate over entries
        for (Integer id : students.keySet()) {
            System.out.println("ID: " + id + ", Name: " + students.get(id));
        }
    }

    public static void demoLinkedHashMap() {
        // Create a LinkedHashMap
        LinkedHashMap<String, Integer> scores = new LinkedHashMap<>();

        // Add entries
        scores.put("Math", 90);
        scores.put("Science", 85);
        scores.put("English", 92);

        // Iterate over entries
        for (String subject : scores.keySet()) {
            System.out.println(subject + ": " + scores.get(subject));
        }
    }

    public static void demoTreeMap() {
        TreeMap<String, String> dictionary = new TreeMap<>();

        // Add entries
        dictionary.put("Apple", "A fruit");
        dictionary.put("Banana", "Another fruit");
        dictionary.put("Car", "A vehicle");

        // Iterate over entries
        for (String word : dictionary.keySet()) {
            System.out.println(word + ": " + dictionary.get(word));
        }
    }

    public static void main(String[] args) {
        demoHashMap();
        demoLinkedHashMap();
        demoTreeMap();
    }
}
