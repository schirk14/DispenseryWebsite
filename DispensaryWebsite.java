import java.util.*;

public class DispensaryWebsite {
  //Method 1: End the system
  static void endSystem(int result) {
      System.exit(result);
  }
  //Method 2: Check to make sure user is of legal age
  static void checkAge(int age) {
    if (age < 21) {
      System.out.println("Access denied - You are not of legal age!");
      endSystem(0);
    } else {
      System.out.println("Access granted - Let's get started!");
    }
  }
  //Method 3: Generate a price
  static int subtotal(int weight){
    return weight * 10;
  }

  public static void main(String[] args) {
    //Create scanners
    Scanner user_age = new Scanner(System.in);
    Scanner strain_type = new Scanner(System.in);
    Scanner cannabis_amount = new Scanner(System.in);
    Scanner cannabis_strain = new Scanner(System.in);
    Scanner user_name = new Scanner(System.in);

    System.out.println("Dispensery Website");
    
    //Welcome
    System.out.println("Welcome! Please enter your age");

    //Check age
    int userAge = user_age.nextInt();
    checkAge(userAge); 

    //Ask name
    System.out.println("What is your name?");
    String name = user_name.nextLine();

    
    //Check name of strain
    System.out.println("What strain are you looking for? Ex. Gorilla Glue, Khlifa Kush, 9lb Hammer, Pineapple Express\n\n");

    String strain = cannabis_strain.nextLine();

    //How much does the user want
    System.out.println("How many grams cannabis are you looking for? \n\n");

    int amount = cannabis_amount.nextInt();
    
    //Let them know how much that will be
    System.out.println("Success! Your total will be $" + subtotal(amount));
    
  }

}