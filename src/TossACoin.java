import java.util.Random;
public class TossACoin {
    public static void main(String[] args) {

        Random random = new Random();

        double number;
        number = random.nextDouble();
        System.out.println(number);

        // Code using the boolean to toss the coin

        Random random1 = new Random();
        boolean isHeads;
        isHeads = random1.nextBoolean();

        if (isHeads) {
            System.out.println(" Heads !");
        }
        else {
            System.out.println(" Tails !");
        }

    }
}
