package org.example;

import java.util.Scanner;

import static org.example.Task.CreateTask;


public class Main {
    public static void main(String[] args) {
        Integer argsLength = args.length;
        if (argsLength == 0) {
            System.out.println("Wrong input. Format: java -cp . org.example.Main add \"Clean the dishes\"");
            main(args);
        }
        String command = args[0];
        switch (command) {
            case "delete":

            case "add":
                CheckForNameInArgs(argsLength);
                String taskName = args[1];
                System.out.println(CreateTask(taskName));
                return;
            case "update":
                CheckForNameInArgs(argsLength);

        }

    }
    public static void CheckForNameInArgs(Integer argsLength){
        if (argsLength < 2) {
            System.out.println("Please provide a task name.");
        }
    }

}