import java.util.Scanner;
/**
 * prints the last digit of users number
 * @author Jaden Ramcharan
 */
public class Main {
  //gets last digit
  public static int lastDigit(int userNum){
    int last = userNum % 10;
    //prints and returns last digit
    System.out.println(last);
    return last;
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner for user input
    Scanner input = new Scanner(System.in);

    //gets number from user
    int userNum = input.nextInt();

    //shows last digit
    lastDigit(userNum);

    
  }
}
