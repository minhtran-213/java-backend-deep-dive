package collectionsexample;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListExample {

    public static void demoArrayList () {
        System.out.println("--Start demonstrating array list--");
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Access elements
        System.out.println(fruits.get(1)); // Output: Banana

        // Iterate over elements
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public static void demoLinkedList() {
        // Create a LinkedList of Integer
        System.out.println("--Start demonstrating linked list--");
        LinkedList<Integer> numbers = new LinkedList<>();

        // Add elements to the LinkedList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Add element at the beginning
        numbers.addFirst(5);

        // Remove an element
        numbers.remove(2); // Removes the element at index 2

        // Iterate over elements
        for (int number : numbers) {
            System.out.println(number);
        }
    }




    public static void main(String[] args) {
        demoArrayList();
        demoLinkedList();
    }
}
