public class FunctionMethods {
    
    // 1) Method: sum of two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // 2) Method with parameters & return value
    public static String greet(String name) {
        return "Hello, " + name;
    }

    // 3) Method overloading (same name, different params)
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    // 4) Recursive method: factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // base case
        }
        return n * factorial(n - 1); // recursive call
    }

    public static void main(String[] args) {
        // Using sum
        int resultSum = sum(10, 20);
        System.out.println("Sum = " + resultSum);

        // Using greet
        System.out.println(greet("Alice"));

        // Using method overloading
        System.out.println("Multiply (int): " + multiply(5, 3));
        System.out.println("Multiply (double): " + multiply(2.5, 4.0));

        // Using recursion
        System.out.println("Factorial of 5 = " + factorial(5));
    }
}
