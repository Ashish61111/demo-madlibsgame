import java.util.Scanner;
public class MadLibsGames {
    public static void main(String[] args) {

        // MAD LIBS GAME.

        Scanner scanner = new Scanner (System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print(" Enter an adjective (description): ");
        adjective1 = scanner.next();
        System.out.print(" Enter an noun (Animal or Person): ");
        noun1 = scanner.next();
        System.out.print(" Enter an adjective (description) ");
        adjective2 = scanner.next();
        System.out.print(" Enter an verb (ends with -ing): ");
        verb1 = scanner.next();
        System.out.print(" Enter an adjective (description) ");
        adjective3 = scanner.next();

        System.out.println(" Today i went to a " + adjective1 + " Zoo ");
        System.out.println(" In an exhibit, I saw a " + noun1 + " ! ");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + " ! ");
        System.out.println(" I was " + adjective3 + " ! ");

        scanner.close();

    }
}
