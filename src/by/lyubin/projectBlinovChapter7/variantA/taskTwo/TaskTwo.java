package by.lyubin.projectBlinovChapter7.variantA.taskTwo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskTwo {

    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog.";

        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i) + "  ");
        }
        System.out.println();

        Pattern p1 = Pattern.compile("\\p{Lower}");
        Pattern p2 = Pattern.compile("\\p{Upper}");

        for (int i = 0; i < text.length(); i++) {
            Matcher m1 = p1.matcher(String.valueOf(text.charAt(i)));
            Matcher m2 = p2.matcher(String.valueOf(text.charAt(i)));
            if (m1.matches()) {
                print(text.charAt(i) - 96);
            } else {
                if (m2.matches()) {
                    print(text.charAt(i) - 64);
                } else {
                    System.out.print("   ");
                }
            }
        }
    }

    private static void print(int input) {
        if (input > 9) {
            System.out.print(input + " ");
        } else {
            System.out.print("0" + input + " ");
        }
    }
}

