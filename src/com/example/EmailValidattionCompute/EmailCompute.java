package com.example.EmailValidattionCompute;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCompute {
    Pattern pattern;
    Matcher matcher;
    public static void email(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("abc@yahoo.com");
        arrayList.add("abc-100@yahoo.com");
        arrayList.add("abc.100@yahoo.com");
        arrayList.add("abc111@abc.com");
        arrayList.add("abc-100@abc.net");
        arrayList.add("abc.100@abc.com.au");
        arrayList.add("abc@1.com");
        arrayList.add("abc@gmail.com.com");
        arrayList.add("abc+100@gmail.com");

    }
    public boolean emailCheck(String value,String regx){
         pattern = Pattern.compile(regx);
         matcher = pattern.matcher(value);
        // boolean val = matcher.matches();
         matcher = pattern.matcher(value);
         boolean val = matcher.matches();
         return val;
    }
}
