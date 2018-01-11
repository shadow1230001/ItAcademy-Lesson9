package by.lyubin.projectBlinovChapter7.variantA.taskEight;

public class Example {
    public static void main(String[] args) {
        String text = "Hello (world! I) bought #new# fountain (pen. *The quick) brown* fox jumps #over the# lazy dog.";

        char ch1 = '(';
        char ch2 = ')';

        String regex = new String("(\\" + ch1 + ".+?\\" + ch2 + ")");
        String newStr = text.replaceAll(regex, "" + ch1 + ch2);

        System.out.println(newStr);
    }
}

