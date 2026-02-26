import java.util.Scanner;
public class FindHypotenuse {
    public static void main(String[] args) {

        // Hypotenuse of Triangle

        double a;
        double b;
        double c;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the side a: ");
        a = input.nextDouble();
        System.out.println("Enter the length of the side b: ");
        b = input.nextDouble();
        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("The hypotenuse of a is " + c);

        Scanner close;




    }
}
