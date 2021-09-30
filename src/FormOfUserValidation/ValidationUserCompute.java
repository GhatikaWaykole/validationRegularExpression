package FormOfUserValidation;
/* purpose validation of the name present on the user form
 * Create the regx to validation of the name in the console
 */
import java.util.Scanner;

public class ValidationUserCompute {
    public static void main(String args[]){
        System.out.println("welcome regular expression compute");
        ValidationOfUserFormat a = new ValidationOfUserFormat();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first and last name to validation");
        String name = scanner.nextLine();
        a.nameValidation(name);
        System.out.println("Enter the email to validation");
        String res = scanner.nextLine();
        a.validateOfEmail(res);
        System.out.println("Enter the number to validation");
        String number = scanner.nextLine();
        a.validateOfNumber(number);
        System.out.println("Enter the login to validation");
        String login = scanner.nextLine();
        a.validationOflogin(login);
    }
}
