package by.lyubin.projectBlinovChapter7.variantA.taskThirteen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
        String poem = "My Shadow.\n" +
                "I have a little shadow that goes in and out with me,\n" +
                "And what can be the use of him is more than I can see.\n" +
                "He is very, very like me from the heels up to the head;\n" +
                "And I see him jump before me, when I jump into my bed.";

        Pattern pattern = Pattern.compile("[\\w-]+");
        Matcher matcher = pattern.matcher(poem);
        while (matcher.find()) {
            if (matcher.group().charAt(0) == matcher.group().charAt(matcher.group().length() - 1) && matcher.group().length() > 1) {
                System.out.println(matcher.group());
            }
        }
    }
}

