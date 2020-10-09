import java.util.Scanner;

public class Opgave3_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter variable one");
        int v1 = input.nextInt();

        System.out.println("Enter variable two");
        int v2 = input.nextInt();

        System.out.println("Enter variable three");
        int v3 = input.nextInt();

        int temp;
        if (v2 < v1 && v1 < v3 || v3 < v1) {
            temp = v1;
            v1 = v2;
            v2 = temp;
        }
        if (v3 < v1) {
            temp = v1;
            v1 = v3;
            v3 = temp;
        }
        if (v3 < v2) {
            temp = v2;
            v2 = v3;
            v3 = temp;
        }
        System.out.println(v1 + " " + v2 + " " + v3);
    }

}
