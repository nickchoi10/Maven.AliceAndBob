import java.util.Scanner
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        Scanner scan = new Scanner(System.in);
        String name;
        System.out.println("what's your name?");
        name = scan.nextLine();

        if (name.equals("Alice" || "Bob")) {
            System.out.println("Greetings!!");
        } else {
            System.out.println("Goodbye");
        }
    }
}
