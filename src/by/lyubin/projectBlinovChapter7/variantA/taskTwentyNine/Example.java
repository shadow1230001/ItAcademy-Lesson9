package by.lyubin.projectBlinovChapter7.variantA.taskTwentyNine;

import java.util.LinkedList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        String text = "The quuick brown foxxx jumps over the lazzy dog.";

        List<Character> chars = new LinkedList<>();
        for (char c : text.toCharArray()) {
            chars.add(c);
        }

        int p = 0;
        while (p < chars.size() - 1) {
            if (chars.get(p).equals(chars.get(p + 1))) {
                chars.remove(p + 1);
            } else {
                p++;
            }
        }

        for (Character c : chars) {
            System.out.print(c);
        }
    }
}
