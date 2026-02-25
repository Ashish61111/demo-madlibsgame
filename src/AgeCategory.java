import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Age category

        String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Are you a student? (True/False): ");
        isStudent = input.nextBoolean();

        // Group 1

        if(name.isEmpty()){
            System.out.print(" You didn't enter your name: ");
        }
        else {
            System.out.println("Hello" + name + " ! ");
        }

        // Group 2

        if (age >= 65){
            System.out.println("You are a senior");
        } else if (age >=18) {
            System.out.println("You are an adult");
        } else if (age <0) {
            System.out.println("You haven't born yet !");
        }
        else{
            System.out.println("You are a Child");
        }

        // Group 3

        if (isStudent){
            System.out.println("You are a Student");
        }
        else{
            System.out.println("You are not a Student");
        }

        Scanner close;
    }
}
