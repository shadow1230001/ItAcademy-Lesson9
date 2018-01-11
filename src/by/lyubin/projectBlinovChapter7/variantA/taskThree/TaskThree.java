package by.lyubin.projectBlinovChapter7.variantA.taskThree;

public class TaskThree {

    public static void main(String[] args) {
        String text = "Pasta and pizza are famous italian dishes.";

        StringBuilder sb = new StringBuilder();

        sb.append(text.charAt(0));
        for (int i = 1; i < text.length(); i++) {
            if ((text.charAt(i) == 'a' || text.charAt(i) == 'A') && (text.charAt(i - 1) == 'p' || text.charAt(i - 1) == 'P')) {
                sb.append('o');
            } else {
                sb.append(text.charAt(i));
            }
        }

        System.out.println(sb);
    }
}

