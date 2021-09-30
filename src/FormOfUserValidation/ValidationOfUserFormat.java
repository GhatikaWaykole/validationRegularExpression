package FormOfUserValidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationOfUserFormat {
   public static Pattern pattern;
   public static Matcher matcher;
   String regx = "^[A-Z]{1}[a-z]{2,}\\s[A-Z]{1}[a-z]{2,}";//validation of regex word have first name beginig with capital and white space in the last name
    String regex = "^[A-Za-z0-9.]+@[a-z.]+[a-z]$";         //validate the name of the word
    String reegex = "^[0-9]{2}\\s[0-9]{10}$";
    // create method and check the name validation with the regx define string
    public static void validationOfWord(String regx,String name){
        pattern = Pattern.compile(regx);
        matcher = pattern.matcher(name);
    }
    public void nameValidation(String name) {
        validationOfWord(regx,name);
        boolean val = matcher.matches();
        System.out.println(val);
        if(val == false){
            System.out.println("Name should begin with capital letter and have space in first name and last");
            }
        }
        public void validateOfEmail(String name){
        validationOfWord(regex,name);
        Boolean val = matcher.matches();
        System.out.println(val);
        if(val == false){
            System.out.println("Email should need validation");
        }
      }
    public void validateOfNumber(String number){
        validationOfWord(reegex,number);
        boolean val = matcher.matches();
        System.out.println(val);
        if(val == false){
            System.out.println("number should have ten digit word");
        }
    }


}
