package by.lyubin.projectBlinovChapter7.variantA.taskTwentyOne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
        String text = "1 word1 2 ololo 34 56 o1o3n4;";

        Matcher matcher = Pattern.compile("\\d").matcher(text);

        int sum = 0;

        while (matcher.find()) {
            sum += Integer.valueOf(matcher.group());
        }

        System.out.println("Sum of numerals in text is " + sum + ".");
    }
}
