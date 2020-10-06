import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Salary  : ");
        double salary = input.nextDouble();
        System.out.print("401(k)  : ");
        double contribution401k = input.nextDouble();
        System.out.print("Federal : ");
        double federal = input.nextDouble();
        System.out.print("State   : ");
        double state = input.nextDouble();

        input.close();

        double salaryAfter401k = salary - (salary * (contribution401k / 100));
        double salaryAfterTaxes = salaryAfter401k - (salaryAfter401k * ((federal + state) / 100));
        double paycheck = salaryAfterTaxes / 24;
        System.out.println("");
        System.out.print("$");
        System.out.printf("%,.2f", paycheck);
        System.out.print(".");
    }
}