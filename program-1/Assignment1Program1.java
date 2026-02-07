import java.util.Scanner;

public class Assignment1Program1 {
  public static void main(String[] args) {
    System.out.println("  SSSSSSSS         SSSSSSSS");
    System.out.println("SSS      SSS     SSS      SSS");
    System.out.println("SSS              SSS");
    System.out.println("  SSSSSS           SSSSSS");
    System.out.println("       SSS              SSS");
    System.out.println("         SSS              SSS");
    System.out.println(" SSS     SSS     gitSSS     SSS");
    System.out.println("   SSSSSSS         SSSSSSS");
    System.out.println("");
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a 5-character string: ");
    String fiveCharacterString = input.nextLine();
    System.out.println(" ");
    System.out.println("Please enter a number in Fahrenheit: ");
    double temperature = input.nextInt();
    temperature = ((temperature - 32)* 5)/9;
    System.out.println(" ");
    System.out.println(temperature);
  }
}
