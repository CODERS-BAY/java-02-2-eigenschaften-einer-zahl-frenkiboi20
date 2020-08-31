import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int luckyNum = 6;
        System.out.println("Glückszahl: 6");

        System.out.print("Zahl eingeben: ");
        int num = sc.nextInt();

        if (num % 10 == 0) {
            System.out.println(num + " ist eine runde Zahl.");
        } else {
            System.out.println(num + " ist keine runde Zahl.");
        }
        if (num % 2 == 0) {
            System.out.println(num + " ist teilbar.");
        } else {
            System.out.println(num + " ist nicht teilbar.");
        }
        if (num == luckyNum) {
            System.out.println("Hey, das ist deine Glückszahl.");
        } else {
            System.out.println("Leider keine Glückszahl.");
        }
        if (num > 9 && num < 100 || num < -9 && num > -100) {
            System.out.println(num + " ist zweistellig.");
        } else {
            System.out.println(num + " ist nicht zweistellig.");
        }

        sc.close();

    }
}
