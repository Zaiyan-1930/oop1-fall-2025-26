package Lab;
import java.util.Scanner;

public class Task2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter original price: ");
        double originalPrice = scanner.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discountPercent = scanner.nextDouble();

        double discountAmount = originalPrice * (discountPercent / 100);
        double finalPrice = originalPrice - discountAmount;

        System.out.printf("Original price: " + originalPrice);
        System.out.printf("Discount Amount :" + discountAmount);
        System.out.printf("Final price: " + finalPrice);

    }
}
