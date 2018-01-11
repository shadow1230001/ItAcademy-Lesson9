package by.lyubin.projectBlinovChapter7.variantA.taskTwentyTwo;

public class Example {
    public static void main(String[] args) {
        String text = "The quick brown /*fox \n*jumps*/ over the lazy-dog\n" +
                "/**\n" +
                "* Yo!\n" +
                "*/\n" +
                "public smth //start\n" +
                "/* comment */\n" +
                "System.out.print(\"/*not a comment*/\")\n" +
                "The end";

        String o1 = text.replaceAll("//.*\\n", "\n"); // replace comments (//)
        String o2 = o1.replaceAll("/\\*(.|\\n)+?\\*/", ""); // replace comments (/** */ /* */)

        System.out.println(o2);
    }
}

