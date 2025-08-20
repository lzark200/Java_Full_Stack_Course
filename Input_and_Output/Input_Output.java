import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nextInt
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // nextLong
        System.out.print("Enter population of your city: ");
        long population = sc.nextLong();

        // nextDouble
        System.out.print("Enter product price: ");
        double price = sc.nextDouble();

        // Clear leftover newline before using nextLine
        sc.nextLine();

        // next
        System.out.print("Enter your first name (one word): ");
        String name = sc.next();

        // Clear leftover newline
        sc.nextLine();

        // nextLine
        System.out.print("Enter your full address: ");
        String address = sc.nextLine();

        // Output using print, println, printf
        System.out.print("Hello, ");
        System.out.println(name + "!");  // println → adds newline
        System.out.println("Your age is " + age);

        // printf formatting
        System.out.printf("City population: %,d%n", population);
        System.out.printf("Price: $%.2f%n", price);
        // System.out.printf("%.2f" , 5);
        System.out.printf("Full address: %s%n", address);

        sc.close();
    }
}
