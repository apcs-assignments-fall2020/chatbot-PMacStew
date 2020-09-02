import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scan.next();
        System.out.println("Nice to meet you " + name + "!");
        System.out.print("What is your favorite TV show? ");
        String tvShow = scan.next();
        System.out.println("My favorite TV show is Riverdale,  but " + tvShow + " is awesome too.");
        System.out.print("What is your favorite type of animal? ");
        String animal = scan.next();
        System.out.println("I agree. " + animal + "s are pretty cool.");
        System.out.print("How many siblings do you have? ");
        String sibling = scan.next();
        int siblings = Integer.parseInt(sibling);
        if (siblings == 0)
            System.out.println("Awww. Being the only child must be hard.");
        else if (siblings == 2)
            System.out.println("Awesome! I have " + sibling + " siblings too!");
        else
            System.out.println("Oh cool. It must be fun to have " + siblings + " sibling(s).");
        System.out.print("Where is your favorite place to go on vacation? ");
        String vacation = scan.next();
        System.out.println(vacation + " sound super fun. Maybe you can take me there next time you go.");


        scan.close();
    }
}
