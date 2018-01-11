package by.lyubin.projectBlinovChapter7.variantA.taskTwelve;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
        String poem = "My Shadow.\n" +
                "I have a little shadow that goes in and out with me,\n" +
                "And what can be the use of him is more than I can see.\n" +
                "He is very, very like me from the heels up to the head;\n" +
                "And I see him jump before me, when I jump into my bed.";

        Pattern pattern = Pattern.compile("\\b[aeiouAEIOU]+?\\w*[aeiouAEIOU]+?\\b");
        Matcher matcher = pattern.matcher(poem);

        int count = 0;

        while (matcher.find()) {
            count++;
            System.out.println(matcher.group());
        }

        System.out.println("There are " + count + " words starts and ends with vowel letters.");
    }
}

