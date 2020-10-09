import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Opgave3_4 {
    public static void main(String[] args) {
        Random randomdage = new Random();
        int min = 1;
        int max = 12;
        int range = max - min + 1;
        int x = randomdage.nextInt(range) - min;

        switch (x) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Februrary");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("Novemeber");
                break;
            case 12:
                System.out.println("December");
                break;

        }
    }
}
