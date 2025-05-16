public class Deco {
    public static void main(String[] args) {
        String name = "World";
        int number = 10;
        double decimal = 3.14;

        System.out.print("Hello, ");
        System.out.print(name);
        System.out.println("!");

        System.out.println("The number is: " + number);
        System.out.println("The decimal is: " + decimal);

        System.out.printf("Formatted output: Name: %s, Number: %d, Decimal: %.2f%n", name, number, decimal);
    }
}