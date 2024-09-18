import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length: ");
        double len = sc.nextDouble();

        System.out.print("Enter the width: ");
        double wid = sc.nextDouble();

        double area = len * wid;


        System.out.println("The area of the rectangle is: " + area);
    }
}
