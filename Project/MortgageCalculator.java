package Project;

import java.util.Scanner;

public class MortgageCalculator {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter principal :");
    double principal = scanner.nextDouble();

    System.out.print("Enter Annual Interest Rate : ");
    float annualRate = scanner.nextFloat();
    double monthlyRate = (annualRate) / 12;

    System.out.print("Enter Loan Period in months :  ");
    int months = scanner.nextInt();

    double monthlyPayment = principal *
        (monthlyRate * Math.pow(1 + monthlyRate, months)) /
        (Math.pow(1 + monthlyRate, months) - 1);

    System.out.print("Enter you salary :");

    while (true) {
      if (scanner.hasNextInt()) {
        int salary = scanner.nextInt();

               if (salary >= 100000) {
               System.out.println("You are eligible for the loan");

                } else {
                System.out.println("Sorry, you are not eligible for the loan");
                }
               break;

      } else {
        System.out.println("Invalid! , enter correct numeric value");
        scanner.next();
      }
    }

    System.out.print("Enter you credit score :");
    while (true) {
      if (scanner.hasNextDouble()) {
        double creditScore = scanner.nextDouble();

                 if (creditScore >= 500) {
                 System.out.println("Enter your credit score (0-500) ");

                 } else {
                  System.out.println("Sorry, you have a very low credit score");
                 }
                 break;

      } else {
        System.out.println("Invalid! , enter correct numeric value");
        scanner.next();
      }

    }

    System.out.print("Do you have any criminal record (True/False) ?:");
    while (true) {
      if (scanner.hasNextBoolean()) {
        boolean hasCrimeRecord = scanner.nextBoolean();

                 if (!hasCrimeRecord) {
                  System.out.println("Great!, you are eligible for the loan");

                  } else {
                  System.out.println("Sorry, you have a criminal record");
                  }
                 break;

      } else {
        System.out.println("Invalid! , enter either true or false");
        scanner.next();
      }

    }
    scanner.close();
  }
}
