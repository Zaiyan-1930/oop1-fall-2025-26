package Lab;


import java.util.Scanner;

public class Task1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Student 1:");
        double marks1 = sc.nextDouble();

        System.out.print("Enter marks of Student 2:");
        double marks2 = sc.nextDouble();

        System.out.print("Enter marks of Student 3:");
        double marks3 = sc.nextDouble();

        double average = (marks1 + marks2 + marks3) / 3;

        System.out.printf("Average score: " + average);
        System.out.println();

    }
}                                                                                                                                         
