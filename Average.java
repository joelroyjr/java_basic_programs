import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        
        System.out.print("Enter the fourth number: ");
        int num4 = sc.nextInt();
        
        System.out.print("Enter the fifth number: ");
        int num5 = sc.nextInt();

        double average = (num1 + num2 + num3 + num4 + num5) / 5.0;

        System.out.println("The average is: " + average);
    }
}
