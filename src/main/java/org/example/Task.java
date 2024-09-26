package org.example;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Task {
    public static Integer idCount = 0;
    private int id;
    private String desc;
    private String status = TaskStatus.todo.name();

    public Task(String adesc){
        this.desc = adesc;
        this.id= ++idCount;
        this.status = TaskStatus.todo.name();
    }

    public String getDesc(){
        return desc;
    }
    public String getStatus(){
        return status;
    }
    public Integer getID(){
        return id;
    }

    public static String CreateTask(String adesc) {
        Task task = new Task(adesc);
        return (String.format("Task added: %d ID", idCount));

    }
    public static String UpdateTask(Integer passID, String newDesc){
        //desc = newDesc;
        return String.format("Updated task %d", passID);
    }

    public static String DeleteTask(Integer delID){
        return "";
    }


    public void UpdateTask(String adesc, int id) {
        try {
            File f = new File("tasks.json");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);

            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist. Create a Task first.");
            e.printStackTrace();
        }

    }
}
