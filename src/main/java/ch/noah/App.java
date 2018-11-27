package ch.noah;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();
        int valueA = 0;
        int valueB = 0;

        System.out.println("Console Calculator");
        System.out.println("===================");

        valueA = 10;
        valueB = 20;

        System.out.println(String.format("Summe %s + %s = %s.", valueA, valueB, calculator.summe(valueA, valueB)));
    }
}
