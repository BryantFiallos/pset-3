import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Wage      : ");
        double wage = input.nextDouble();
        System.out.print("Monday    : ");
        double mondayHours = input.nextDouble();
        System.out.print("Tuesday   : ");
        double tuesdayHours = input.nextDouble();
        System.out.print("Wednesday : ");
        double wednesdayHours = input.nextDouble();
        System.out.print("Thursday  : ");
        double thursdayHours = input.nextDouble();
        System.out.print("Friday    : ");
        double fridayHours = input.nextDouble();
        System.out.print("Saturday  : ");
        double saturdayHours = input.nextDouble();
        System.out.print("Sunday    : ");
        double sundayHours = input.nextDouble();

        double totalHours = mondayHours + tuesdayHours + wednesdayHours + thursdayHours + fridayHours + saturdayHours + sundayHours;
        double totalPay = totalHours * wage;

        System.out.println("");
        System.out.print("$");
        System.out.printf("%.2f", totalPay);
        System.out.print(".");

    }
}