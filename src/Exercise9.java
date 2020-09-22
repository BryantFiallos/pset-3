import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Amount : ");
        float userInput = input.nextFloat();

        userInput = userInput * 100;

        int amount = (int)userInput;

        int quarters = amount / 25;
        quarters = quarters - (quarters % 1);
        amount = amount - (quarters * 25);
        int dimes = amount / 10;
        dimes = dimes - (dimes % 1);
        amount = amount - (dimes * 10);
        int nickels = amount / 5;
        nickels = nickels - (nickels % 1);
        amount = amount - (nickels * 5);
        int pennies = amount / 1;
        pennies = pennies - (pennies % 1);


        System.out.print("\nQuarters : ");
        System.out.print(quarters);
        System.out.print("\nDimes    : ");
        System.out.print(dimes);
        System.out.print("\nNickels  : ");
        System.out.print(nickels);
        System.out.print("\nPennies  : ");
        System.out.print(pennies);

    }
}