import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Amount : ");
        double amount = input.nextDouble();

        double quarters = amount / 0.25;
        quarters = quarters - (quarters % 1);
        amount = amount - (quarters * 0.25);
        double dimes = amount / 0.10;
        dimes = dimes - (dimes % 1);
        amount = amount - (dimes * 0.10);
        double nickels = amount / 0.05;
        nickels = nickels - (nickels % 1);
        amount = amount - (nickels * 0.05);
        double pennies = amount / 0.01;
        pennies = pennies - (pennies % 1);


        System.out.print("\nQuarters : ");
        System.out.printf("%.0f", quarters);
        System.out.print("\nDimes    : ");
        System.out.printf("%.0f", dimes);
        System.out.print("\nNickels  : ");
        System.out.printf("%.0f", nickels);
        System.out.print("\nPennies  : ");
        System.out.printf("%.0f", pennies);

    }
}