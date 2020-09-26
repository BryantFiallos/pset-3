import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Homework 1 : ");
        double hw1 = input.nextDouble();
        System.out.print("Homework 2 : ");
        double hw2 = input.nextDouble();
        System.out.print("Homework 3 : ");
        double hw3 = input.nextDouble();
        System.out.print("Quiz 1     : ");
        double quiz1 = input.nextDouble();
        System.out.print("Quiz 2     : ");
        double quiz2 = input.nextDouble();
        System.out.print("Test 1     : ");
        double test1 = input.nextDouble();

        double hwAverage = (hw1 + hw2 + hw3) / 3;
        double quizAverage = (quiz1 + quiz2) / 2;

        double finalGrade = 0.15 * hwAverage + 0.35 * quizAverage + 0.5 * test1;

        System.out.println("");
        System.out.printf("%.2f", finalGrade);
        System.out.print("%.");

    }
}