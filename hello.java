import java.time.LocalDate;

public class hello {
    public static void main(String[] args) {
        System.out.println("Here ye, Here ye, important announcement");
        System.out.println("hello world");
        System.out.println("Good bye curel world");
        System.out.println("Hi Alice");
        System.out.println("Hi Bob");
        System.out.println("Hi Charlie");
        System.out.println("Hello Denise");
        System.out.println("Hello Ester");

        LocalDate myDate = LocalDate.now();
        System.out.println(myDate);

        System.out.println("Free memory (bytes): " + 
        Runtime.getRuntime().freeMemory());
    }
}