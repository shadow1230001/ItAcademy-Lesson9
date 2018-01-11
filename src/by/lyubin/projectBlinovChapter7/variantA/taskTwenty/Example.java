package by.lyubin.projectBlinovChapter7.variantA.taskTwenty;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
        String text = "My Shadow.\n" +
                "I have a little shadow that goes in and out with me,\n" +
                "And what can be the use of him is more than I can see.\n" +
                "He is very, very like me from the heels up to the head;\n" +
                "And I see him jump before me, when I jump into my bed.";

        Matcher matcher = Pattern.compile("\\p{Punct}").matcher(text);

        int count = 0;

        while (matcher.find()) {
            count++;
        }

        System.out.println("Number of punctuation marks is " + count + ".");
    }
}

