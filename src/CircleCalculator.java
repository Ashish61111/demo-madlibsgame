import java.sql.SQLOutput;
import java.util.Scanner;
public class CircleCalculator {
    public static void main(String[] args) {
        //* Circumference = 2 * Math.pi * radius;
        //* Area = Math. pi * Math.pow(radius, 2);
        //* Volume = (4.0/3.0) * Math.pi * Math.pow(radius, 3)

        Scanner input = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the Radius: ");
        radius = input.nextDouble();


        circumference = 2* Math.PI * radius;
        area = Math.PI * Math.pow(radius,2);
        volume = (4.0/3.0) * Math.PI* Math.pow(radius, 3);

        System.out.println("The Circumference is: " + circumference + " cm");
        System.out.println("The Area is: " + area + " cm");
        System.out.println("The Volume is: " + volume + " cm³");


        Scanner close;


    }
}
