package by.lyubin.projectBlinovChapter7.variantA.taskTen;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        String text = "Hello world! I bought new fountain pen. The quick brown fox jumps world over the lazy dog.";
        Map<Character, Integer> charMap = new HashMap<>();
        int n = 5;

        for (int i = 0; i < text.length(); i++) {
            if (charMap.containsKey(text.charAt(i))) {
                charMap.put(text.charAt(i), charMap.get(text.charAt(i)) + 1);
            } else {
                charMap.put(text.charAt(i), 1);
            }
        }

        Set<Map.Entry<Character, Integer>> charSet = charMap.entrySet();
        List<Map.Entry<Character, Integer>> charList = new ArrayList<>(charSet);
        charList.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        if (n <= charList.size()) {
            for (int i = 0; i < n; i++) {
                System.out.println(charList.get(i));
            }
        }
    }
}

