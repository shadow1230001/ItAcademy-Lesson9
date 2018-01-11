package by.lyubin.projectBlinovChapter7.variantA.taskTwentySix;

public class Example {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i <= 100000; i++) {
            text.append(i);
        }

        int m = 555;
        int n = 600;

        String subStr = text.substring(m, n);
        System.out.println(subStr);
    }
}

