import java.util.Scanner;

public class Opgave3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a");
        System.out.println("Enter b");
        System.out.println("Enter c");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double d = Math.pow(b,2) - 4 * a * c;
        double r1 = (-b + Math.sqrt(d)) / 2*a;
        double r2 = (-b - Math.sqrt(d)) / 2*a;

        if (d > 0) {
            System.out.println("Equation has two roots" + r1 + r2);
        } else if (d == 0) {
            System.out.println("Equation has one root" + r1);
        } else if (d < 0) {
            System.out.println("Equation has no root");
        }
    }
}
