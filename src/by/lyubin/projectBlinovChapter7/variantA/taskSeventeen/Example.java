package by.lyubin.projectBlinovChapter7.variantA.taskSeventeen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
        String text = "kjbu!##1jnkj3!@# jfnufn  fdfw42rf%$#!sdf";

        Pattern pattern = Pattern.compile("[\\W]+");
        Matcher matcher = pattern.matcher(text);

        int maxLength = 0;
        String str = null;

        while (matcher.find()) {
            if (matcher.group().length() > maxLength) {
                maxLength = matcher.group().length();
                str = matcher.group();
            }
        }

        System.out.println("First max non-word sequence is: " + str);
    }
}

