import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fahrenheit : ");
        double degreesF = input.nextDouble();

        input.close();

        double degreesC = (degreesF - 32) * 5/9;
        double degreesK = degreesC + 273.15;

        System.out.print("\nCelsius    : ");
        System.out.printf("%.2f", degreesC);
        System.out.print("\nKelvin     : ");
        System.out.printf("%.2f", degreesK);

    }
}
