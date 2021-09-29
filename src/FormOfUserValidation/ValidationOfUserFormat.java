package FormOfUserValidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationOfUserFormat {
    Pattern pattern;
    Matcher matcher;
    String regx = "^[A-Z]{1}+[a-z]{2,}";             //validation of regex word

    // create method and check the name validation with the regx define string
    public void nameValidation(String name) {
        pattern = Pattern.compile(regx);
        matcher = pattern.matcher(name);
        boolean val = matcher.matches();
        System.out.println(val);
        if(val == false){
            System.out.println("Name should begin with the captial and having 3 or more words");
            }
        }
}
