public class ArithmeticOperator {
    public static void main(String[] args) 
    {
        System.out.println(7 / 2);          // 3
        System.out.println(-7 / 2);         // -3
        System.out.println(-7 % 4);         // -3
        System.out.println(1.0 / 0);        // Infinity
        System.out.println(0.0 / 0.0);      // NaN

        // Relational & equality
        System.out.println('A' < 'a');      // true
        System.out.println(0.1 + 0.2 == 0.3); // false
        System.out.println(Double.NaN == Double.NaN); // false

        // Logical vs bitwise on booleans
        String s = null;
        System.out.println(s != null && s.length() > 0); // false, safe
        // System.out.println(s != null & s.length() > 0); // would NPE

        // Bitwise
        System.out.println(0b1010 & 0b1100); // 8
        System.out.println(~5);              // -6
        System.out.println(-8 >> 1);         // -4
        System.out.println(-8 >>> 1);        // 2147483644
        System.out.println(1 << 32);         // 1 (shift count wraps)

        // Assignment/compound
        short t = 1;
        // t = t + 1;     // compile error
        t += 1;           // ok (narrowing in compound)
        System.out.println(t); // 2

        // Ternary typing
        Object o = (true) ? 1 : 1.0; // Double
        System.out.println(o.getClass());     // class java.lang.Double

        // how to use the ternary operator:
        int x = 45;
        int y = (x == 50)? 78 : 80 ; 
        System.out.println(y);
    }
}
