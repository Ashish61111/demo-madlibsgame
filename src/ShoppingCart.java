import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        String item;
        double price;
        int quantity;
        char currency;
        double total;

        System.out.print("What item would you like to buy? : ");
        item = sc.nextLine();
        System.out.print("What price for each? : ");
        price = sc.nextDouble();
        System.out.print("How many would you like to buy? : ");
        quantity = sc.nextInt();

        total = price * quantity;

        System.out.println("/n you have brought" + quantity + " $ " + item + "/n" );
        System.out.println("Your Total is $" + total);

        sc.close();

    }
}
