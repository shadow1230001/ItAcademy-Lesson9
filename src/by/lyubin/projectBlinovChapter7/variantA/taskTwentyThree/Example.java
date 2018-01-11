package by.lyubin.projectBlinovChapter7.variantA.taskTwentyThree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
        String text = "Hello World, hello world. New fountain pen, new pen.";

        Map<String, Integer> words = new HashMap<>();

        Matcher matcher = Pattern.compile("[\\w]+").matcher(text.toLowerCase());

        while (matcher.find()) {
            words.merge(matcher.group(), 1, Integer::sum);
        }
        System.out.print("Word which contained in text odd times: ");
        Set<String> wordsSet = new HashSet<>(words.keySet());
        for (String s : wordsSet) {
            if (words.get(s) % 2 != 0) {
                System.out.println(s);
                break;
            }
        }
    }
}

