import java.util.Scanner;

public class Opgave3_2 {
    public static void main(String[] args) {
        int n1 = (int)(System.currentTimeMillis() % 10);
        int n2 = (int)(System.currentTimeMillis() / 10 % 10);
        int n3 = (int)(System.currentTimeMillis() / 10 / 10 % 10);

        Scanner input = new Scanner(System.in);

        System.out.println("What is " + n1 + " + " + n2 + " + " + n3 + " ? ");

        int answer = input.nextInt();

        System.out.println(n1 + " + " + n2 + " + " + n3 + " = " + answer + " is " + (n1 + n2 + n3 == answer));
    }
}
