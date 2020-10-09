import java.util.Scanner;

public class Opgave3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter today's day");
        int dage = input.nextInt();
        System.out.println("Enter elapsed days");
        int dagesincetoday = input.nextInt();
        dagesincetoday = (dage + dagesincetoday) % 6;

        String currentday = null;
        String futureday = null;

        if (dage > 7 || dage <= 0) {
            System.out.println("That is not a valid day");
        } else {
            switch (dage) {
                case 1:
                    currentday = "Mandag";
                    break;
                case 2:
                    currentday = "Tirsdag";
                    break;
                case 3:
                    currentday = "Onsdag";
                    break;
                case 4:
                    currentday = "Torsdag";
                    break;
                case 5:
                    currentday = "Fredag";
                    break;
                case 6:
                    currentday = "Lørdag";
                    break;
                case 7:
                    currentday = "Søndag";
                    break;
        }
        switch (dagesincetoday) {
            case 1:
                futureday = "Mandag";
                break;
            case 2:
                futureday = "Mandag";
                break;
            case 3:
                futureday = "Mandag";
                break;
            case 4:
                futureday = "Mandag";
                break;
            case 5:
                futureday = "Mandag";
                break;
            case 6:
                futureday = "Mandag";
                break;
            case 7:
                futureday = "Mandag";
                break;
        }
        }
        System.out.println("Today is " + currentday + " and the future day is " + futureday);
    }

}
