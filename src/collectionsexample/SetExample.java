package collectionsexample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {
    public static void demoHashSet() {
        System.out.println("--Start demonstrating hash set--");
        // Create a HashSet of String
        HashSet<String> colors = new HashSet<>();

        // Add elements
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red"); // Duplicate, will be ignored

        // Iterate over elements
        for (String color : colors) {
            System.out.println(color);
        }
    }

    public static void demoLinkedHashSet() {
        System.out.println("--Start demonstrating linked set--");
        // Create a LinkedHashSet of String
        LinkedHashSet<String> animals = new LinkedHashSet<>();

        // Add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");

        // Iterate over elements
        for (String animal : animals) {
            System.out.println(animal);
        }
    }

    public static void demoTreeSet() {
        // Create a TreeSet of Integer
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);

        // Iterate over elements
        for (int number : numbers) {
            System.out.println(number); // Output: 20, 40, 50
        }
    }

    public static void main(String[] args) {
        demoHashSet();
        demoLinkedHashSet();
        demoTreeSet();
    }
}
