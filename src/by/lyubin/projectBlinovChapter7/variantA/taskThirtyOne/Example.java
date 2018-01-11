package by.lyubin.projectBlinovChapter7.variantA.taskThirtyOne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
        String text = "The quick brown Fox jumps over the lazy Dog.";
        int count = 0;

        Matcher matcher = Pattern.compile("\\b\\p{Upper}\\w+\\b").matcher(text);
        while (matcher.find()) {
            count++;
        }

        System.out.println("Number of words started with cursive letter: " + count + ".");
    }
}
