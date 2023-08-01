package Print;

import java.util.Locale;

public class Print {
    public static void main(String[] args) {
        // line seperator - %n
        // boolean formater = %b,%B
        System.out.printf("Hello World %b %n",null);
        System.out.printf("Hello World %b %n", 1);
        System.out.printf("Hello World %B %n", 0);

        // String Formatting %s,%S - has given, upper case
        System.out.printf("%s%n", "pAnkaj");
        System.out.printf("%S%n", "pAnkaj");

        System.out.printf("'%12s'%n", "panakj");
        System.out.printf("'%-12s'%n", "panakj");

        System.out.printf("'%5.6s'%n", "Hi there!");

        // Integer %d
        System.out.printf("%d%n", 2989);
        System.out.printf(Locale.US, "%,d %n", 10000);
        System.out.printf(Locale.ITALY, "%,d %n", 10000);

        // Floating point
        System.out.printf("%f%n", 3.14159265);
        System.out.printf("'%5.2f'%n",3.14159265);
        System.out.printf("'%5.2e'%n", 3.14159265);
    }
}
