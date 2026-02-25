import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {



        int number1;
        int number2;
        int number3;

        Random random = new Random();

        number1 = random.nextInt(1, 99);
        number2 = random.nextInt(1, 999);
        number3 = random.nextInt(1, 9999);

        System.out.println("Your number is: " + number1);
        System.out.println("Your number is: " + number2);
        System.out.println("Your number is: " + number3);


    }
}
