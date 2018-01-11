package by.lyubin.projectBlinovChapter7.variantA.taskFifteen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
        String text = "Hello world! I bought new fountain pen. The quick brown fox jumps world over the lazy dog.";

        Pattern pattern = Pattern.compile("[\\w-]+");
        Matcher matcher = pattern.matcher(text);

        int count = 0;

        while (matcher.find()) {
            count++;
        }

        int costPerWord = 2;

        int finalCost = costPerWord * count;

        System.out.println("Final cost of the message is $ " + finalCost + ".");
    }
}

