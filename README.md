# Detailed Syllabus with Examples

Welcome! This guide provides detailed explanations and simple examples for each topic in the first part of your syllabus. Since you're new to Java and backend development, we'll start from the basics and build up your understanding.

---

## **Java Collections**

Java Collections Framework provides a set of classes and interfaces to store and manipulate groups of objects. It includes Lists, Sets, and Maps.

### **List Interface**

### **ArrayList**

- **Description**: A resizable array implementation of the List interface. It's best for storing and accessing data.
- **When to Use**: When you need fast iteration and random access to elements.

**Example**:

```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of String
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
}

```

### **LinkedList**

- **Description**: A doubly-linked list implementation of the List and Deque interfaces. Efficient for adding/removing elements from the middle.
- **When to Use**: When you have frequent insertions and deletions in the list.

**Example**:

```java
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of Integer
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
}

```

### **Set Interface**

### **HashSet**

- **Description**: Stores unique elements; does not maintain any order.
- **When to Use**: When you need to prevent duplicates and order doesn't matter.

**Example**:

```java
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
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
}

```

### **LinkedHashSet**

- **Description**: Maintains insertion order while storing unique elements.
- **When to Use**: When you need to maintain order without duplicates.

**Example**:

```java
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
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
}

```

### **TreeSet**

- **Description**: Stores unique elements in sorted (natural) order.
- **When to Use**: When you need a sorted set.

**Example**:

```java
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
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
}

```

### **Map Interface**

### **HashMap**

- **Description**: Stores key-value pairs; does not maintain any order.
- **When to Use**: When you need fast insertion, deletion, and lookup.

**Example**:

```java
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap of Integer and String
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
}

```

### **LinkedHashMap**

- **Description**: Maintains insertion order for key-value pairs.
- **When to Use**: When you need a predictable iteration order.

**Example**:

```java
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
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
}

```

### **TreeMap**

- **Description**: Stores key-value pairs in sorted order based on keys.
- **When to Use**: When you need a sorted map.

**Example**:

```java
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap
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
}

```

### **ConcurrentHashMap**

- **Description**: A thread-safe implementation of Map; allows concurrent read and write operations.
- **When to Use**: In multi-threaded applications where multiple threads access the map concurrently.

**Example**:

```java
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        // Create a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> inventory = new ConcurrentHashMap<>();

        // Add entries
        inventory.put("Pen", 100);
        inventory.put("Notebook", 200);

        // Simulate concurrent access (simplified)
        new Thread(() -> {
            inventory.put("Eraser", 50);
        }).start();

        new Thread(() -> {
            System.out.println("Inventory: " + inventory);
        }).start();
    }
}

```

### **Generic Types**

- **Description**: Generics allow you to create classes, interfaces, and methods with type parameters. It ensures type safety by checking types at compile time.
- **When to Use**: When you want to write code that works with any object type.

**Example**:

```java
import java.util.ArrayList;

public class GenericsExample {
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

```

---

## **Exception Handling and Best Practices**

Exception handling in Java allows you to handle runtime errors, ensuring your program can handle exceptions gracefully.

### **Types of Exceptions**

1. **Checked Exceptions**: Exceptions that are checked at compile-time.
    - **Example**: `IOException`, `SQLException`.
2. **Unchecked Exceptions**: Exceptions that occur at runtime.
    - **Example**: `NullPointerException`, `ArithmeticException`.
3. **Errors**: Serious issues that applications should not catch.
    - **Example**: `OutOfMemoryError`, `StackOverflowError`.

### **Try-Catch-Finally Block**

- **Description**: Used to catch exceptions that might occur in a block of code.
- **Syntax**:

```java
try {
    // Code that may throw an exception
} catch (ExceptionType1 e1) {
    // Handle exception type 1
} catch (ExceptionType2 e2) {
    // Handle exception type 2
} finally {
    // Code that will always execute
}

```

**Example**:

```java
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int division = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("This block always executes.");
        }
    }
}

```

### **Try-With-Resources Statement**

- **Description**: Simplifies the management of resources like streams and files by automatically closing them.
- **Syntax**:

```java
try (ResourceType resource = new ResourceType()) {
    // Use the resource
} catch (ExceptionType e) {
    // Handle exceptions
}

```

**Example**:

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}

```

### **Custom Exception**

- **Description**: Create your own exception classes for specific error conditions.

**Example**:

```java
// Define a custom exception
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Use the custom exception
public class BankAccount {
    private double balance = 500.0;

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Not enough balance.");
        }
        balance -= amount;
    }
}

// Test the custom exception
public class CustomExceptionExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        try {
            account.withdraw(600.0);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage()); // Output: Not enough balance.
        }
    }
}

```

### **Best Practices**

- **Catch Specific Exceptions**: Catch the most specific exceptions first.
- **Avoid Empty Catch Blocks**: Don't catch exceptions without handling them.
- **Use Finally Block or Try-With-Resources**: Ensure resources are closed properly.
- **Don't Use Exceptions for Flow Control**: Exceptions should represent exceptional conditions.
- **Log Exceptions**: Keep track of exceptions for debugging.

---

## **Multithreading and Concurrency**

Multithreading allows concurrent execution of two or more parts of a program to maximize the utilization of CPU.

### **Thread Life Cycle and States**

1. **New**: Thread is created but not yet started.
2. **Runnable**: Thread is ready to run but waiting for CPU time.
3. **Running**: Thread is executing.
4. **Blocked/Waiting**: Thread is waiting for a resource or event.
5. **Terminated**: Thread has completed execution.

### **Creating Threads with Runnable and Callable**

### **Using Runnable Interface**

- **Description**: Implement the `Runnable` interface and override the `run()` method.

**Example**:

```java
public class RunnableExample implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableExample());
        thread.start(); // Starts the thread
    }
}

```

### **Using Callable Interface**

- **Description**: Implement the `Callable` interface to return a result and throw exceptions.

**Example**:

```java
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableExample implements Callable<String> {
    @Override
    public String call() {
        return "Callable Result";
    }

    public static void main(String[] args) throws Exception {
        CallableExample callable = new CallableExample();
        FutureTask<String> futureTask = new FutureTask<>(callable);

        Thread thread = new Thread(futureTask);
        thread.start();

        // Get the result
        String result = futureTask.get();
        System.out.println(result); // Output: Callable Result
    }
}

```

### **Synchronization and Locks**

- **Description**: Synchronization prevents multiple threads from accessing shared resources simultaneously to avoid data inconsistency.

**Example**:

```java
public class Counter {
    private int count = 0;

    // Synchronized method
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

// Test the Counter
public class SynchronizationExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Create two threads that share the same Counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        // Should be 2000 if synchronized correctly
        System.out.println("Final Count: " + counter.getCount());
    }
}

```

### **Deadlocks, Livelocks, and Thread Starvation**

### **Deadlock**

- **Description**: Occurs when two or more threads are blocked forever, each waiting for the other.

**Example**:

```java
public class DeadlockDemo {
    public static void main(String[] args) {
        final String resource1 = "Resource1";
        final String resource2 = "Resource2";

        // Thread 1
        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked Resource1");

                try { Thread.sleep(50); } catch (InterruptedException e) {}

                synchronized (resource2) {
                    System.out.println("Thread 1: Locked Resource2");
                }
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Locked Resource2");

                try { Thread.sleep(50); } catch (InterruptedException e) {}

                synchronized (resource1) {
                    System.out.println("Thread 2: Locked Resource1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}

```

**Note**: In this example, both threads are waiting for each other to release resources, causing a deadlock.

### **Livelock**

- **Description**: Threads are not blocked but are too busy responding to each other to resume work.

### **Thread Starvation**

- **Description**: Threads are unable to gain regular access to shared resources and are unable to make progress.

### **Future and CompletableFuture**

### **Future**

- **Description**: Represents the result of an asynchronous computation.

**Example**:

```java
import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Integer> futureResult = executor.submit(() -> {
            Thread.sleep(2000); // Simulate long computation
            return 42;
        });

        System.out.println("Doing other tasks...");

        // Get the result
        Integer result = futureResult.get(); // Blocks until result is available
        System.out.println("Result: " + result);

        executor.shutdown();
    }
}

```

### **CompletableFuture**

- **Description**: An extension of Future that can be completed explicitly and can be chained with callbacks.

**Example**:

```java
import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(2000); } catch (InterruptedException e) {}
            return 42;
        });

        completableFuture.thenAccept(result -> {
            System.out.println("Result: " + result);
        });

        System.out.println("Doing other tasks...");

        // Keep the main thread alive to see the result
        try { Thread.sleep(3000); } catch (InterruptedException e) {}
    }
}

```

---

## **Functional Programming in Java**

Java supports functional programming features, allowing you to write more concise and readable code.

### **Lambda Expressions**

- **Description**: Anonymous functions that can be treated as values.

**Syntax**:

```java
(parameters) -> expression

```

**Example**:

```java
import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack");

        // Using a lambda expression to print each name
        names.forEach(name -> System.out.println(name));
    }
}

```

### **Functional Interfaces**

- **Description**: Interfaces with a single abstract method, which can be implemented using lambda expressions.

**Example**:

```java
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Using lambda expression to define the operate method
        MathOperation addition = (a, b) -> a + b;

        int result = addition.operate(5, 3);
        System.out.println("Result: " + result); // Output: 8
    }
}

```

### **Method References**

- **Description**: A shorthand for writing lambda expressions that call an existing method.

**Types**:

1. **Reference to a Static Method**: `ClassName::methodName`
2. **Reference to an Instance Method**: `instance::methodName`
3. **Reference to a Constructor**: `ClassName::new`

**Example**:

```java
import java.util.Arrays;

public class MethodReferenceExample {
    public static void main(String[] args) {
        String[] stringArray = {"Bob", "Alice", "Charlie"};

        // Using method reference to sort the array
        Arrays.sort(stringArray, String::compareToIgnoreCase);

        // Print sorted array
        for (String name : stringArray) {
            System.out.println(name);
        }
    }
}

```

### **Stream API**

- **Description**: Provides a way to process data in a declarative way.

**Example**:

```java
import java.util.Arrays;
import java.util.List;

public class StreamAPIExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Filter even numbers and print them
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println); // Output: 2, 4
    }
}

```

---

## **Modern Java Features**

Java has evolved over the years, introducing new features in each version.

### **Java 8**

### **Optional**

- **Description**: A container that may or may not contain a non-null value. Helps to avoid `NullPointerException`.

**Example**:

```java
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String[] words = new String[10];
        words[2] = "Hello";

        Optional<String> optionalWord = Optional.ofNullable(words[2]);

        // Check if value is present
        if (optionalWord.isPresent()) {
            System.out.println("Word: " + optionalWord.get());
        } else {
            System.out.println("No word found");
        }
    }
}

```

### **Date and Time API**

- **Description**: New APIs for handling dates and times in `java.time` package.

**Example**:

```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DateTimeExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); // Current date
        LocalTime time = LocalTime.now(); // Current time
        LocalDateTime dateTime = LocalDateTime.now(); // Current date and time

        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("DateTime: " + dateTime);
    }
}

```

### **Java 11**

### **`var` Keyword**

- **Description**: Local variable type inference; the compiler infers the type.

**Example**:

```java
public class VarExample {
    public static void main(String[] args) {
        var message = "Hello, Java 11!";
        System.out.println(message);

        var number = 10;
        System.out.println("Number: " + number);
    }
}

```

### **New String Methods**

- **Description**: Added methods like `isBlank()`, `strip()`, `repeat()`, `lines()`.

**Example**:

```java
public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "   Hello World   ";

        System.out.println("Is Blank: " + str.isBlank()); // false
        System.out.println("Strip: '" + str.strip() + "'"); // 'Hello World'
        System.out.println("Repeat: " + str.strip().repeat(3)); // 'Hello WorldHello WorldHello World'

        String multiline = "Line1\\nLine2\\nLine3";
        multiline.lines().forEach(System.out::println);
    }
}

```

### **Java 17 and 21**

### **Sealed Classes (Java 17)**

- **Description**: Restricts which classes can extend or implement a class or interface.

**Example**:

```java
// Sealed class
public sealed class Vehicle permits Car, Bike {}

// Permitted subclasses
public final class Car extends Vehicle {}
public final class Bike extends Vehicle {}

```

### **Records (Java 16)**

- **Description**: A compact syntax for data classes that are simple carriers of data.

**Example**:

```java
public record Point(int x, int y) {}

public class RecordExample {
    public static void main(String[] args) {
        Point point = new Point(10, 20);
        System.out.println("X: " + point.x());
        System.out.println("Y: " + point.y());
    }
}

```

### **Pattern Matching for `instanceof` (Java 16)**

- **Description**: Simplifies the use of `instanceof` by introducing pattern variables.

**Example**:

```java
public class PatternMatchingExample {
    public static void main(String[] args) {
        Object obj = "Hello, World!";

        if (obj instanceof String s) {
            System.out.println(s.toUpperCase());
        }
    }
}

```

---

### **Passed by Value**

In Java, all variables are passed by value. This means that when you pass a variable to a method, the method receives a copy of the variable's value, not the actual variable itself. For objects, the reference (or address) to the object is passed by value.

### **Realistic Example**:

Consider a method that updates a value in an object, such as modifying an order status in an e-commerce application.

```java
public static String printString(String s) {
  for(int i=0; i< 2; i++) {
    s = s + String.valueOf(i);
  }
  return s;
}

public static void main(String[] args) {
  String s = "hello";
  String m = printString(s);
  System.out.println(m); //hello01
  System.out.println(s); //hello
}
```

In this scenario, `myOrder` is passed by value, but since the value is a reference to the object, the object itself can be modified within the method.

---

### **2. Interface and Abstract Class**

### **Interface**

- An interface is a contract where classes that implement the interface agree to implement its methods. It's typically used to define common behavior across multiple classes. In real-world projects, you might use interfaces to define services in a microservices architecture.
- You should use an **interface** when you want to define a contract that can be implemented by multiple unrelated classes. For example, in a large system with different kinds of objects that need to follow a specific behavior, like a payment processing system with different payment methods, using an interface is ideal.
- Why Use an Interface?
    - **Multiple Implementations**: You can have multiple classes implementing the same interface but with different implementations (CreditCardProcessor, PayPalProcessor, etc.)
    - **Decoupling**: Interfaces promote loose coupling. The client code doesn’t need to know the actual type of payment processor—it only cares about the common interface

**Realistic Example:**

```java
interface PaymentProcessor {
    void processPayment(double amount);
}

class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class PayPalProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

public class InterfaceUsageExample {
    public static void main(String[] args) {
        PaymentProcessor creditCard = new CreditCardProcessor();
        PaymentProcessor paypal = new PayPalProcessor();
        
        creditCard.processPayment(150.00);
        paypal.processPayment(200.00);
    }
}

```

In this example, both PayPal and Stripe implement the `PaymentProcessor` interface and provide their own payment processing logic.

### **Abstract Class**

- An abstract class is a class that cannot be instantiated on its own. It can have both abstract methods (without implementation) and concrete methods (with implementation). It is often used to provide shared functionality for multiple subclasses.
- You should use an **abstract class** when you have classes that share some common code but also need some methods to be overridden by subclasses. An abstract class allows you to provide default functionality that all subclasses can use or override.
- Why Use an Abstract Class?
    - **Common Code**: If you have several classes that share common fields or methods (like `login` and `logout` in the example), an abstract class is the best place to put shared functionality.
    - **Partial Implementation**: Abstract classes can provide default behavior for some methods while requiring specific methods to be implemented by subclasses (like `accessControl` in the example).
    - **When a Clear Hierarchy Exists**: If the classes are part of a clear hierarchy (e.g., `User` → `AdminUser`, `RegularUser`), using an abstract class helps organize and manage shared behavior.

**Realistic Example:**

```java
abstract class User {
    String username;

    public User(String username) {
        this.username = username;
    }

    // Shared functionality for all users
    public void login() {
        System.out.println(username + " has logged in.");
    }

    public void logout() {
        System.out.println(username + " has logged out.");
    }

    // Abstract method for access control, to be implemented by subclasses
    abstract void accessControl();
}

class AdminUser extends User {
    public AdminUser(String username) {
        super(username);
    }

    @Override
    void accessControl() {
        System.out.println(username + " has admin access.");
    }
}

class RegularUser extends User {
    public RegularUser(String username) {
        super(username);
    }

    @Override
    void accessControl() {
        System.out.println(username + " has regular user access.");
    }
}

public class AbstractClassUsageExample {
    public static void main(String[] args) {
        User admin = new AdminUser("Alice");
        User regularUser = new RegularUser("Bob");

        admin.login();
        admin.accessControl();
        admin.logout();

        regularUser.login();
        regularUser.accessControl();
        regularUser.logout();
    }
}

```

In a user management system, both `AdminUser` and `RegularUser` might share common functionality (e.g., login and logout methods), but their implementation of certain features (e.g., access control) could differ.

### **When to Use Interface Over Abstract Class:**

1. **Behavior Across Unrelated Classes**: If you want to share behavior across classes that aren't related in a strict hierarchy (e.g., `PaymentProcessor`), use an interface.
2. **Multiple Inheritance**: If you anticipate a class needing to adopt multiple behaviors (like a class that both processes payments and sends notifications), interfaces are better suited because Java supports multiple interface inheritance.
3. **Decoupling**: If you're trying to decouple your code from specific implementations (e.g., different payment processors or logging mechanisms), interfaces are a better choice.

### **When to Use Abstract Class Over Interface:**

1. **Base Class for Related Classes**: If the classes you're dealing with are related and share some common logic or state (like `User` and its subclasses), then an abstract class is better.
2. **Code Reuse**: If there's some shared implementation that you want subclasses to inherit and use (like `login` and `logout` in the `User` example), an abstract class is a better choice.
3. **Hierarchy with Shared State**: When you have a well-defined hierarchy and want to enforce a common state (e.g., shared fields, constructors), an abstract class provides a better structure.

---

### **3. Static Keyword**

The `static` keyword is used for memory management, and it can be applied to *variables*, *methods*, *blocks*, and *nested classes*.

**Static Members in the Method Area**

- Static members are stored in *Method Area* (which is a part of the Java Heap Memory).

**When are Static Members Loaded?**

- Static members are loaded when the class is first referenced.

```
class MyClass {
  static int a = 10;

  static {
      System.out.println("Static block executed.");
  }

  static void staticMethod() {
      System.out.println("Static method called.");
  }
}

public class Main {
    public static void main(String[] args) {
        // Class is loaded and static members are initialized/loaded
        MyClass.staticMethod();  // First reference causes class loading
    }
}

```

In this example, the class `MyClass` is loaded when `MyClass.staticMethod()` is first referenced (call).

- Static variable `a` is initialized.
- The static block is executed.
- The static method becomes available for execution.

*Common use cases of static variables and static methods:*

- **Constants Variables:** Used to define constants that do not change, typically marked `final`.
- **Utility Methods:** Used for helper functions that don't require an instance.
- **Factory Methods:** Used to create instances of a class without needing an object.
- **Singleton Pattern:** Ensures only one instance of a class is created using a static method.

*Ref:*  https://github.com/minhtran-q/deep-dive-into-java?tab=readme-ov-file#static

### **1. Static Variables (Class Variables)**

**Definition**: Static variables are class-level variables, meaning they are shared by all instances of the class. They are initialized only once when the class is loaded into memory.

### **Realistic Example**:

A scenario where static variables are useful is in a web application where you want to keep track of the total number of users visiting the site, regardless of how many instances of the `User` class exist.

```java
class User {
    private String name;
    // Static variable to keep track of user count across all instances
    private static int userCount = 0;

    public User(String name) {
        this.name = name;
        userCount++;
    }

    public static int getUserCount() {
        return userCount;
    }
}

public class StaticVariableExample {
    public static void main(String[] args) {
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        // Access static variable through class, not instances
        System.out.println("Total users: " + User.getUserCount()); // Output: Total users: 2
    }
}

```

**When to Use Static Variables**:

- Use static variables when you need to store data that should be shared across all instances of a class (e.g., tracking counters, configuration settings).

---

### **2. Static Methods**

**Definition**: Static methods belong to the class, not to any specific instance. They can only access static variables and static methods directly.

### **Realistic Example**:

A typical example is a utility method for validating inputs, such as checking if an email is valid, which doesn't require an instance of the class.

```java
class InputValidator {
    // Static method to validate email addresses
    public static boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }
}

public class StaticMethodExample {
    public static void main(String[] args) {
        // Call static method without creating an instance of InputValidator
        String email = "test@example.com";
        if (InputValidator.isValidEmail(email)) {
            System.out.println("Valid email.");
        } else {
            System.out.println("Invalid email.");
        }
    }
}

```

**When to Use Static Methods**:

- Use static methods for utility operations that don’t depend on instance-specific data, like mathematical operations (`Math.sqrt()`), string validations, etc.

---

### **3. Static Class**

**Definition**: A static class in Java refers to a **static inner class**. It is an inner class that does not require an instance of the outer class to be instantiated. It can access the static members of the outer class.

### **Realistic Example**:

Consider a scenario where a `DatabaseConnection` class contains a `ConnectionConfig` static inner class for setting up configurations.

```java
class DatabaseConnection {
    private static String dbUrl = "jdbc:mysql://localhost:3306/mydb";

    // Static nested class
    static class ConnectionConfig {
        public static void printConfig() {
            System.out.println("DB URL: " + dbUrl);
        }
    }
}

public class StaticClassExample {
    public static void main(String[] args) {
        // Access static inner class without creating an instance of the outer class
        DatabaseConnection.ConnectionConfig.printConfig();
    }
}

```

**When to Use Static Inner Classes**:

- Use static inner classes when you need to create a helper class that doesn’t depend on the outer class's instance. It’s commonly used for organizing related code within the main class.

---

### **4. Static Block (Static Initializer Block)**

**Definition**: Static blocks are used to initialize static variables when the class is first loaded. They are executed once, when the class is loaded into memory, before any object creation.

### **Realistic Example**:

- A static block can be used to load configuration settings from a file when a class is first loaded, such as reading database credentials.
- They are executed when the class is loaded into memory, before any object is created.

```java
java
Copy code
class AppConfig {
    private static String configFilePath;

    // Static block to initialize static variables
    static {
        configFilePath = "/path/to/config/file";
        System.out.println("Static block executed. Config file path set.");
    }

    public static String getConfigFilePath() {
        return configFilePath;
    }
}

public class StaticBlockExample {
    public static void main(String[] args) {
        // Static block is executed when the class is loaded
        System.out.println("Config file path: " + AppConfig.getConfigFilePath());
    }
}

```

**When to Use Static Blocks**:

- Use static blocks when you need to initialize static variables or execute logic when the class is loaded (e.g., loading external resources, configurations, or setting up logging).

---

### **5. Difference Between Static and Non-Static Inner Class**

- **Static Inner Class**: A static inner class does not require an instance of the outer class to be created. It can access static members of the outer class but not instance members.
- **Non-Static Inner Class**: A non-static inner class requires an instance of the outer class. It can access both static and instance members of the outer class.

### **Realistic Example:**

Let’s consider a `Company` class where a `Department` can be either static (like a utility department) or non-static (like individual departments tied to specific company instances).

```java
class Company {
    String companyName;

    public Company(String companyName) {
        this.companyName = companyName;
    }

    // Non-static inner class (belongs to an instance)
    class Department {
        String departmentName;

        public Department(String departmentName) {
            this.departmentName = departmentName;
        }

        public void printDetails() {
            System.out.println("Department: " + departmentName + " in " + companyName);
        }
    }

    // Static inner class (belongs to the class itself)
    static class UtilityDepartment {
        public static void printUtilityDetails() {
            System.out.println("This is a utility department, common to all companies.");
        }
    }
}

public class InnerClassExample {
    public static void main(String[] args) {
        // Non-static inner class requires an instance of the outer class
        Company company = new Company("Tech Corp");
        Company.Department department = company.new Department("IT");
        department.printDetails(); // Output: Department: IT in Tech Corp

        // Static inner class does not require an instance of the outer class
        Company.UtilityDepartment.printUtilityDetails(); // Output: This is a utility department, common to all companies.
    }
}

```

**When to Use Static vs Non-Static Inner Classes**:

- **Static Inner Class**: Use when the inner class should not depend on the outer class's instance, like helper classes or utility components.
- **Non-Static Inner Class**: Use when the inner class logically belongs to a specific instance of the outer class, like departments belonging to specific companies.

---

### **Conclusion**

- **Static Variables**: Shared across all instances, useful for class-wide constants or counters.
- **Static Methods**: Utility functions that do not depend on object state, such as validation or logging methods.
- **Static Class**: Nested classes that can be used independently of an instance of the outer class, ideal for grouping related code.
- **Static Block**: Executed when the class is loaded, useful for initializing static data.
- **Static vs Non-Static Inner Class**: Static inner classes are independent of an outer instance, while non-static inner classes require an outer class instance.

These static features are critical in designing Java applications with effective memory management, utility design, and logical organization.

---

### **4. String**

Strings in Java are immutable, meaning once a `String` object is created, it cannot be changed. Operations on strings create new string objects. In real-life scenarios, strings are often used to manage user input, such as processing user names or messages.

### **Realistic Example**: Imagine processing user comments on a blog platform.

```java
public class StringExample {
    public static void main(String[] args) {
        String comment = "  This is a great blog post!   ";

        // Clean up the comment by trimming whitespace and converting to lowercase
        String cleanedComment = comment.trim().toLowerCase();

        // Moderate the comment by replacing specific words
        String moderatedComment = cleanedComment.replaceAll("great", "good");

        System.out.println("Original Comment: " + comment);
        System.out.println("Cleaned Comment: " + cleanedComment);
        System.out.println("Moderated Comment: " + moderatedComment);
    }
}
```

In this example, trimming the comment, converting it to lowercase, and replacing certain words are all common tasks when processing user input in real-life applications.

### String literals vs. String objects

**String Literals:**

```java
String s1 = "Hello"
```

- Memory: Stored in String pool, a special memory area within the Heap
- Generally faster because it reuse the existing objects in the pool (if the value has already existed, it will refer to that existing value instead of creating a new one)

String Objects:

```java
String s2 = new String("Hello");
```

- Memory: Stored in the heap but outside string pool
- Always create new Object even if there are existing value → Slower

## String, StringBuilder, and StringBuffer

- String (Immutable):

    ```java
    String str = "Hello";
    ```

    - Thread-safety: Because it’s immutable, it is thread-safe
    - Although it’s thread-safe, but it comes to inefficient for memory whenever there’s a change for the string.
    - Usage: use when you know the string won’t be changed frequently
- StringBuilder (Mutable, Non Thread-safe)

    ```java
    StringBuilder sb = new StringBuilder("Hello");
    
    ```

    - Thread-safety: Not synchronized
    - Ideal for scenarios that need frequent modifications to string but don’t need thread-safety
    - Usage: use in single-threaded applications
- StringBuffer (Mutable, Thread-safe)

    ```java
    StringBuffer sb = new StringBuffer("Hello");
    ```

    - Thread-safety: Synchronized, safe for use by multiple threads, but has performance trade off.
    - Efficiency: Slower due to synchronization
    - Usage: use when you need frequently modification and multiple threads.

### Best practice:

- **String**: Use for constant values, display messages, and cases where immutability is desired.
- **StringBuilder**: Use for building or concatenating strings in performance-sensitive, single-threaded applications.
- **StringBuffer**: Use in multithreaded environments where strings are frequently modified and need to be thread-safe.