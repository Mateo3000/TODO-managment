package com.company;

public class Main {
    static String [] tasks = new String [100];
    static String [] projects = new String [100];
    static String [] changeLog = new String [100];

    static int tasksCount = 0;
    static int projectsCount = 0;
    static int changeLogCount = 0;

    public static void displayMenu ()
    {
        System.out.println("1 - Create new task");
        System.out.println("2 - Remove task");
        System.out.println("3 - Create new project");
        System.out.println("4 - Display all taks");
        System.out.println("5 - Display all projects");
        System.out.println("6 - Display change log");
        System.out.println("6 - Exit app");
    }

    public static void addTask (String task)
    {
        boolean hasCapacityForNewTask = tasksCount < tasks.length;

        if (hasCapacityForNewTask)
        {
            tasks [tasksCount] = tasks;
            tasksCount++;
        }
    }

    public static void removeTask (int indexTask)
    {
        boolean isTaskExist = indexTask < tasksCount;

    }

    public static void main(String[] args) {
	// write your code here
    }
}
