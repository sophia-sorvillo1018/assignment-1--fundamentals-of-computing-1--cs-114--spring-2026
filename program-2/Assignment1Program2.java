import java.util.Scanner;

public class Assignment1Program2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a base (2 - 9): ");
    int baseNum = input.nextInt();
    int maxNumUsingBase = (baseNum - 1) * ((baseNum * baseNum * baseNum) + (baseNum * baseNum) + baseNum + 1);
    System.out.println("The maximum, 4-digit, base 10 number in base " + baseNum + " is " + maxNumUsingBase);
    System.out.println("Now, enter a base 10 number in the range 0 to " + maxNumUsingBase + " to convert: ");
    int numToConvert = input.nextInt();
    int covertingNumForEquation = numToConvert;
    int newBase = 0;
    int placeValue = 1;
    while (covertingNumForEquation > 0) {
      int remainder = covertingNumForEquation % baseNum;
      newBase += remainder * placeValue;
      placeValue *= 10;
      covertingNumForEquation /= baseNum;
    }
    System.out.println(numToConvert + "(base 10) = " + newBase + " (base " + baseNum + ")");
  }
}
