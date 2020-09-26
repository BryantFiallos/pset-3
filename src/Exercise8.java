import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Students : ");
        double students = input.nextDouble();
        System.out.print("Teachers : ");
        double teachers = input.nextDouble();
        System.out.print("Capacity : ");
        double capacity = input.nextDouble();

        double totalPassengers = students + teachers;
        double overflow = totalPassengers % capacity;
        double busesRequired = (totalPassengers / capacity) + 0.49;
        double busesRequiredOutPut = busesRequired + 0.49;

        System.out.println("");
        System.out.print("Buses required      : ");
        System.out.printf("%.0f", busesRequired);
        System.out.print("\nOverflow passengers : ");
        System.out.printf("%.0f", overflow);


    }
}