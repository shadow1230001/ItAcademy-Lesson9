package by.lyubin.projectBlinovChapter7.variantA.taskEighteen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
        String text = "bbade bce bcas";
        String[] letters = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};

        StringBuilder sb = new StringBuilder("Consonant letters contained less than in 2 word in text: ");

        for (String s : letters) {
            String regex = new String("[\\w&&[^" + s + "]]*[" + s + "]+[\\w&&[^" + s + "]]*");
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text.toLowerCase());
            int count = 0;
            while (matcher.find()) {
                count++;
            }
            if (count <= 2 && count >= 1) {
                sb.append(s).append(", ");
            }
        }

        if (sb.toString().equals("Consonant letters contained less than in 2 word in text: ")) {
            sb.append("no letters.");
        } else {
            sb.setLength(sb.length() - 2);
            sb.append(".");
        }
        System.out.println(sb);
    }
}

