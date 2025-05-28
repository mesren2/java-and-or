# java-and-or
A(n extremely simple) creation of and/or (&amp;|) in Java.
## Usage example
```java
public class Main {
    public static void main(String[] args) {
        AndOr test1 = new AndOr(true, true, false); // one false → returns true
        System.out.println("Result: " + test1.get()); // Output: true

        AndOr test2 = new AndOr(true, true, true); // all true → returns false
        System.out.println("Result: " + test2.get()); // Output: false
    }
}
```
