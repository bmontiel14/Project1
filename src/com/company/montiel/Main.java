package com.company.montiel;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        ArrayList<String> taskList = new ArrayList<>();
        while(true) {


            System.out.println("Please choose an option:");
            System.out.println("(1) Add a task.");
            System.out.println("(2) Remove a task.");
            System.out.println("(3) Update a task.");
            System.out.println("(4) List all tasks.");
            System.out.println("(0) Exit.");
            Scanner input = new Scanner(System.in);
            int userInput = input.nextInt();
            input.nextLine();
            if (userInput == 1) {
                addTask(taskList);
            } else if (userInput == 2) {
                deleteTask(taskList);
            } else if (userInput == 3) {
                updateTask(taskList);
            } else if (userInput == 4) {
                displayAllTasks(taskList);
            } else if (userInput == 0) {
                exitProgram();
            }
        }







    }

    static ArrayList<String> updateTask(ArrayList<String> taskList){
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter an index value of task to update");
        int userInput = input.nextInt();
        input.nextLine();
        System.out.println("What would you like to change the task to?");
        String desc = input.nextLine();
        taskList.set(userInput,desc);
        return taskList;

    }

    static void displayAllTasks(ArrayList<String> taskList){
        System.out.println(taskList);
    }

    static ArrayList<String> addTask(ArrayList<String> a){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a description of a task");
        String userInput = input.nextLine();
        a.add(userInput);
        return a;
    }

    public static void deleteTask(ArrayList tasks){
        Scanner input = new Scanner(System.in);
        System.out.println("Which element would you like to remove?");
        int index = input.nextInt();
        input.nextLine();
        tasks.remove( index-1);

    }

    static void exitProgram(){
        System.exit(0);
    }

}
