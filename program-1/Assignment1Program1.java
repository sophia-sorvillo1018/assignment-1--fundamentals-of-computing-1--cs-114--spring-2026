import java.util.Scanner;

public class Assignment1Program1 {
  public static void main(String[] args) {
    System.out.println("  SSSSSSSS         SSSSSSSS");
    System.out.println("SSS      SSS     SSS      SSS");
    System.out.println("SSS              SSS");
    System.out.println("  SSSSSS           SSSSSS");
    System.out.println("       SSS              SSS");
    System.out.println("         SSS              SSS");
    System.out.println(" SSS     SSS     SSS      SSS");
    System.out.println("   SSSSSSS         SSSSSSS");
    System.out.println("");
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a 5-character string: ");
    String fiveCharacterString = input.nextLine();
    char thirdInSequence = fiveCharacterString.charAt(1);
    char secondInSequence = fiveCharacterString.charAt(2);
    char firstInSequence = fiveCharacterString.charAt(3);
    System.out.println(" ");
    System.out.println("Please enter a number in Fahrenheit: ");
    double tempFahrenheit = input.nextInt();
    double tempCelsius = ((tempFahrenheit - 32)* 5)/9;
    System.out.println(" ");
    input.close();
    System.out.println("Random number generated. Continuing...");
    System.out.println(" ");
    int randomNum = 32 + (int)(Math.random() * ((16384 - 32) + 1));
    System.out.println("Your new string is " + tempCelsius + firstInSequence + secondInSequence + thirdInSequence + randomNum);
  }
}
