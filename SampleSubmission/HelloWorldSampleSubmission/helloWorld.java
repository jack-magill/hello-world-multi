import java.io.IOException;
import java.util.Scanner;

public class helloWorld {

    public static void main(String args[]) throws IOException {
        Scanner in = new Scanner(System.in);
        String input;

        while (in.hasNextLine()) {
            input = in.nextLine();
            System.out.println(hello(input));
        }
    }

    public static String hello(String input) 
    {
        return String.format("Hello, %s.", input);
    }
}