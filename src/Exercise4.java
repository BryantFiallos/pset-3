import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Height : ");
        double height = input.nextDouble();

        System.out.print("Width : ");
        double width = input.nextDouble();

        double perimeterInches = (2 * height) + (2 * width);
        double perimeterCM = perimeterInches * 2.54;

        System.out.println("");
        System.out.printf("%,.2f", perimeterCM);
        System.out.print(" centimeters.");
    }
        }