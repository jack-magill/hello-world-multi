import java.io.IOException;
import java.util.Scanner;

public class helloWorld2 {

    public static void main(String args[]) throws IOException {
        Scanner in = new Scanner(System.in);
        String input;

        while (in.hasNextLine()) {
            input = in.nextLine();
            System.out.println(hello2(input));
        }
    }

    public static String hello2(String input) 
    {
        return String.format("%s, hello.", input);
    }
}