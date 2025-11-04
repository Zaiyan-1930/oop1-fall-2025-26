package Lab;


import java.util.Scanner;

public class Task3 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
    
        double fahrenheit = (celsius * 9/5) + 32;
        
         System.out.printf("Celsius to Farenheit"+  fahrenheit); 

    }
}
