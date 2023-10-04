public class MyClass {
    static int staticField;
    static int count;

    // Static initialization block
    static {
        // This block is executed once when the class is loaded
        System.out.println("Static initialization block is executed.");
        staticField = 42; // Initialize the static field
    }

    public MyClass() {
        count++;
    }

}
