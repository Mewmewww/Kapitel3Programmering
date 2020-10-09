import java.util.Scanner;

public class Opgave3_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds");
        double weight = input.nextDouble();

        System.out.println("Enter height in feet");
        double feet = input.nextDouble();
        System.out.println("Enter it in inches too");
        double inches = input.nextDouble();

        double height = (feet * 12) + inches;

        final double KG_PER_POUND = 0.45359237;
        final double Meter_Pr_Inch = 0.0254;

        double weightinkgs = weight * KG_PER_POUND;
        double heightinmeters = height * Meter_Pr_Inch;
        double BMI = weightinkgs / (heightinmeters * heightinmeters);

        System.out.println("BMI is " + BMI);
    }
}
