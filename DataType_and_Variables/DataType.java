public class DataType {
    // primitive Data type : 
    public static void main(String[] args) {
        // Integer types
        byte b = 127;
        short s = 32000;
        int i = 123456;
        long l = 12345678900L;

        // Floating-point types
        float f = 3.14f;      // 'f' needed for float
        double d = 2.718281828;

        // Character type
        char letter = 'A';
        char symbol = '\u20AC'; // Unicode Euro sign

        // Boolean type
        boolean flag = true;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + letter + " " + symbol);
        System.out.println("boolean: " + flag);

    }
}
