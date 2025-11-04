package Lab;

public class MidLab2 {
    public static void main(String args[]){

        String firstName = "Zaiyan";
        String lastName  = "Rahman";
        String fullName = firstName + " " + lastName;
        System.out.println("Full name :"+ fullName);
         
       
        String productName = "Apple";
        String productID = " 24-08";
        String productCode= productName + " " + productID;
        System.out.println("productCode : " + productCode);

        String email ="Zaiyan@gmail.com";
        String substring = email.substring(0,6);
        System.out.println("Username: "+ substring);

        
        String chatApp = "Hello,you ok?";
        System.out.println("number of characters:" + chatApp.length());


         String sentence="this is mine";
         String upperCase = sentence.toUpperCase();
         String lowerCase = sentence.toLowerCase();
         System.out.println("Uppercase: " + upperCase);
         System.out.println("Lowercase: " + lowerCase);


         String word =" I like bikes";
         String replacedString = word.replace("bikes","cars");
         System.out.println("replaced words :" + replacedString);
    
        }

    }
