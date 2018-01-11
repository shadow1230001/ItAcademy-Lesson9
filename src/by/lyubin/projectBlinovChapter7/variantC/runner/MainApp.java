package by.lyubin.projectBlinovChapter7.variantC.runner;

import by.lyubin.projectBlinovChapter7.variantC.logick.TaskOne;

public class MainApp {
    public static void main(String[] args){
        TaskOne task = new TaskOne();
        String input = "Hello my friend!";
        task.go(input);
    }
}
