import java.util.Scanner;
public class StudentDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter your Age: ");
        int age = sc.nextInt();

        System.out.print("Enter your CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.printf("\n--- Student Details ---\n");
        System.out.printf("Name : %s\n", name);
        System.out.printf("Age  : %d years\n", age);
        System.out.printf("CGPA : %.2f\n", cgpa);

        Scanner close;
    }
}
