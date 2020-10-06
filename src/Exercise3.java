import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Height : ");
        double height = input.nextDouble();

        System.out.print("Width : ");
        double width = input.nextDouble();

        input.close();

        double area = (height * width);

        double areaMM = area * 645.16;

        System.out.println("");

        System.out.printf("%,.2f", areaMM);
        System.out.print(" square millimeters.");
    }
}