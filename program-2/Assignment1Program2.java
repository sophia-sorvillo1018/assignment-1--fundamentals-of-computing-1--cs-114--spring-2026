import java.util.Scanner;

public class Assignment1Program2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a base (2 - 9): ");
    String baseNum = input.next();
    System.out.println("The maximum, 4-digit, base 10 number in base " + baseNum + " is ");
  }
}
