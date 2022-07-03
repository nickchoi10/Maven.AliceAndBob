import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    //    public static void main(String[] args ){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("what's your name?");
//        String name = scan.nextLine();
//
//        if (name=="Alice") {
//            System.out.println("Greetings Alice!!!");
//        }if (name == "Bob") {
//            System.out.println("Greetings Bob!!!");
//        }else {
//            System.out.println("I will not greet you.");
//        }
//    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine(); //getting input from user...
        Main names = new Main();
        names.AliceAndBob(name);

    }

    public void AliceAndBob(String name) {
        if (name.equalsIgnoreCase("Alice")) {
            System.out.println("Hello Alice");
             }
            else if (name.equalsIgnoreCase("Bob")){
                System.out.println("Hello Bob");
            }

        }
    }



