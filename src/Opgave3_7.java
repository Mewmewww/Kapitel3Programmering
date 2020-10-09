import java.util.Scanner;

public class Opgave3_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("for meget skal betales");
        double maengde = input.nextDouble();
        Byttepenge(maengde);
    }
    public static void Byttepenge(double maengde) {
        int resterende_maengde = (int)(maengde * 100);

        int maengdeafendollar = resterende_maengde / 100;
        resterende_maengde = resterende_maengde % 100;

        int maengdeafkvarter = resterende_maengde / 25;
        resterende_maengde = resterende_maengde % 25;

        int maengdeaftiende = resterende_maengde / 10;
        resterende_maengde = resterende_maengde % 10;

        int maengdeafnikkel = resterende_maengde / 5;
        resterende_maengde = resterende_maengde % 5;

        int maengdeafoere = resterende_maengde;
        System.out.println("Din mængde $" + maengde + " svarer til ");
        System.out.println("= " + maengdeafendollar + (maengdeafendollar == 1 ? " dollar" : " dollars"));
        System.out.println("= " + maengdeafkvarter + (maengdeafkvarter == 1 ? " kvarter" : " kvartere"));
        System.out.println("= " + maengdeaftiende + (maengdeaftiende == 1 ? " tiende" : " tiendende"));
        System.out.println("= " + maengdeafnikkel + (maengdeafnikkel == 1 ? " nikkel" : " nickels"));
        System.out.println("= " + maengdeafoere + (maengdeafoere == 1 ? " øre" : " ører"));
    }
}