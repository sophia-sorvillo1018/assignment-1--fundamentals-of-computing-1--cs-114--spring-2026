import java.util.Scanner;

public class Assignment1Program2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a base (2 - 9): ");
    int baseNum = input.nextInt();
    int maxNumUsingBase = (baseNum - 1) * ((baseNum * baseNum * baseNum) + (baseNum * baseNum) + baseNum + 1);
    System.out.println("The maximum, 4-digit, base 10 number in base " + baseNum + " is " + maxNumUsingBase);
    System.out.println("Now, enter a base 10 number in the range 0 to " + maxNumUsingBase + " to convert: ");
    int numToCovert = input.nextInt();
  }
}
