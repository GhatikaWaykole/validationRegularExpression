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
    }
}
