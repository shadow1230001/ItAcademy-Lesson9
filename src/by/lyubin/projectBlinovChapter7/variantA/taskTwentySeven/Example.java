package by.lyubin.projectBlinovChapter7.variantA.taskTwentySeven;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
        String text = "Привет привёт ПРЙВЕТ.";
        String input = "привет";

        StringBuilder regex = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (input.toLowerCase().charAt(i) == 'и' || input.toLowerCase().charAt(i) == 'й') {
                regex.append("[ий]");
            } else {
                if (input.toLowerCase().charAt(i) == 'е' || input.toLowerCase().charAt(i) == 'ё') {
                    regex.append("[её]");
                } else {
                    regex.append(input.charAt(i));
                }
            }
        }

        int count = 0;

        Matcher matcher = Pattern.compile(regex.toString()).matcher(text.toLowerCase());
        while (matcher.find()) {
            count++;
        }

        System.out.println("Word like \'" + input + "\' appears int text " + count + " time(s).");
    }
}

