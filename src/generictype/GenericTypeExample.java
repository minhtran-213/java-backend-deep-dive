package generictype;

import java.util.ArrayList;

public class GenericTypeExample {
    public static void main(String[] args) {
        // Without Generics
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(123); // No error at compile time

        // With Generics
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("World");
        // stringList.add(456); // Compile-time error

        // Access elements without casting
        String word = stringList.get(0);
        System.out.println(word);
    }
}
