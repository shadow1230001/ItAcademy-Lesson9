package by.lyubin.projectBlinovChapter7.variantA.taskTwentyEight;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
        String text = "Hello World! The quick brown FOX jumps over the lazy DOG." +
                "JAVA rules the Internet.";

        System.out.println("Source text:");
        System.out.println(text);
        System.out.println("Fixed text:");

        StringBuilder sb = new StringBuilder();

        Matcher matcher = Pattern.compile(".+?[!?.]").matcher(text.toLowerCase());
        while (matcher.find()) {
            sb.append(matcher.group().trim().substring(0, 1).toUpperCase());
            sb.append(matcher.group().trim().substring(1));
            sb.append(" ");
        }

        System.out.println(sb);
    }
}

