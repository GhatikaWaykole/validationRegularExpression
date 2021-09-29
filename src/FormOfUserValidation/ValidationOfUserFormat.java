package FormOfUserValidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationOfUserFormat {
    Pattern pattern;
    Matcher matcher;
    String regx = "^[A-Z]{1}[a-z]{2,}\\s[A-Z]{1}[a-z]{2,}";             //validation of regex word have first name beginig with capital and white space in the last name

    // create method and check the name validation with the regx define string
    public void nameValidation(String name) {
        pattern = Pattern.compile(regx);
        matcher = pattern.matcher(name);
        boolean val = matcher.matches();
        System.out.println(val);
        if(val == false){
            System.out.println("Name should begin with capital letter and have space in first name and last");
            }
        }
}
