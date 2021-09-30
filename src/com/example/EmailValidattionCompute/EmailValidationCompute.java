package com.example.EmailValidattionCompute;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationCompute {
    public static void main(String args[]){
        String name = "aBc@";
        String regx = "^[a-zA-z0-9_-][^..]+@[a-zA-Z0-9]{2,}+[a-zA-z0-9]{2,}$";
        EmailCompute a = new EmailCompute();
        Pattern pattern;
        Matcher matcher;
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("abc-100@yahoo.com");
        arrayList.add("abc.100@yahoo.com");
        arrayList.add("abc111@abc.com");
        arrayList.add("abc-100@abc.net");
        arrayList.add("abc.100@abc.com.au");
        arrayList.add("abc@1.com");
        arrayList.add("abc@gmail.com.com");
        arrayList.add("abc+100@gmail.com");
        for(int i=0;i<arrayList.size();i++){
            pattern = Pattern.compile(regx);
            matcher = pattern.matcher(arrayList.get(i));
            boolean val = matcher.matches();
            System.out.println(val);
        }
        pattern = Pattern.compile(regx);
        matcher = pattern.matcher(name);
        boolean val = matcher.matches();
        System.out.println(val);
    }
}

/* email validate pattern compute
 * abc – must contains “@” symbol [[a-zA-Z]+@]
 * abc@.com.my – tld can not start with dot “.” [a-zA-z]+@+[a-zA-Z]
 * abc123@gmail.a – “.a” is not a valid tld, last tld must contains at least two
characters [a-zA-Z]{2,}
* abc123@.com – tld can not start with dot “.” @+[a-zA-Z]{2,}
* abc123@.com.com – tld can not start with dot “.”  [a-zA-z]{2,}
* abc@abc.com – email’s 1st character can not start with “.”  ^[a-zA-z]
* abc()*@gmail.com – email’s is only allow character, digit, underscore and dash [[a-zA-z0-9_-]+@[a-zA-Z0-9]{2,}+@+[a-zA-z0-9]{2,}$]
* abc@%*.com – email’s tld is only allow character and digit [[a-zA-z0-9]]
* abc..2002@gmail.com – double dots “.” are not allow [^[a-zA-z0-9_-][^..]]
* abc.@gmail.com – email’s last character can not end with dot “.” [[a-zA-z0-9]{2,}$]
*
 */