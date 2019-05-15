package com.company;

import java.util.Scanner;

public class Main {
    static String[] tasks = new String[100];
    static String[] projects = new String[100];
    static String[] changeLog = new String[100];

    static int tasksCount = 0;
    static int projectsCount = 0;
    static int changeLogCount = 0;

    public static void displayMenu() //opis Menu
    {
        System.out.println("1 - Create new task");
        System.out.println("2 - Remove task");
        System.out.println("3 - Create new project");
        System.out.println("4 - Remove project");
        System.out.println("5 - Display all taks");
        System.out.println("6 - Display all projects");
        System.out.println("7 - Display change log");
        System.out.println("0 - Exit app");
    }

    public static void addTask(String task) //metoda dodająca zadania
    {
        boolean hasCapacityForNewTask = tasksCount < tasks.length; //sptawdza czy jest miejsce na nowe zadania

        if (hasCapacityForNewTask)
        {
            tasks[tasksCount] = task;
            tasksCount++;
            addLog("Dodano nowe zadanie : " + task);
        }
        else
        {
            addLog("Nie udało się dodać nowego zadania: " + task);
        }
    }

    public static void removeTask(int indexTask) //metoda usuwająca zadania
    {
        boolean isTaskExist = indexTask < tasksCount;

        if (isTaskExist)
        {
            addLog("Usunięto zadanie : " + tasks[indexTask]);
            for (int i = indexTask; i < tasksCount - 1; i++)
            {
                tasks[i] = tasks[i + 1];
            }
            tasksCount--;
        }
        else
        {
            addLog("Nie udało się usunąć zadania " + tasks[indexTask]);
        }
    }
    public static void addProject(String project) //metoda dodająca projekty
    {
        boolean hasCapacityForNewProjects = projectsCount < projects.length; //sptawdza czy jest miejsce na nowe projekty

        if (hasCapacityForNewProjects)
        {
            projects [projectsCount] = project;
            projectsCount++;
            addLog("Dodano nowy projekt : " + project);
        }
        else
        {
            addLog("Nie udało się dodać nowego projekt: " + project);
        }
    }

    public static void removeProject(int indexProject) //metoda usuwająca zadania
    {
        boolean isTaskExist = indexProject < projectsCount;

        if (isTaskExist) {
            addLog("Usunięto projekt : " + projects[indexProject]);
            for (int i = indexProject; i < projectsCount - 1; i++)
            {
                projects [i] = projects [i+1];
            }
            projectsCount--;
        }
        else
        {
            addLog("Nie udało się usunąć projektu: " + projects[indexProject]);
        }

    }

    public static void displayTasks()  //metoda pokazująca listę zadań
    {
        System.out.println("List of tasks: ");
        for (int i = 0; i < tasksCount; i++)
        {
            System.out.println((i+1) + tasks[i]);
        }
        addLog("Wyświetlono listę zadań");
    }
    public static void displayProjects()  //metoda pokazująca listę projektów
    {
        System.out.println("List of projects: ");
        for (int i = 0; i < projectsCount; i++)
        {
            System.out.println((i+1) + projects[i]);
        }
        addLog("Wyświetlono listę projektów");
    }
    public static void displayChangeLog()  //metoda pokazująca listę zmian
    {
        System.out.println("List of change log: ");

        for (int i = 0; i < changeLogCount; i++)
        {
            System.out.println((i+1) + changeLog[i]);
        }
    }

    public static void addLog (String indexLog) //metoda dodająca zmianę
    {
        boolean hasCapacityForNewLogs = changeLogCount < changeLog.length; //sptawdza czy jest miejsce na nowe zmiany

        if (hasCapacityForNewLogs)
        {
            changeLog [changeLogCount] = indexLog;
            changeLogCount++;
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); //podpięcie obsługi klawiatury Scanner
        int radix;
        boolean isApplicationRun = true;
        while (isApplicationRun) {
            displayMenu();
            System.out.print("Type number to choose option: ");
            radix = scanner.nextInt();

            switch (radix) {
                case 1:
                    System.out.println("Podaj nazwę zadania do dodania");
                    String task = scanner.next();
                    addTask(task);
                    break;
                case 2:
                    System.out.println("Podaj index zadania do usunięcia");
                    int indexTask = scanner.nextInt();
                    removeTask(indexTask);
                    break;
                case 3:
                    System.out.println("Podaj nazwę projektu do dodania");
                    String project = scanner.next();
                    addProject(project);
                    break;
                case 4:
                    System.out.println("Podaj index projektu do usunięcia");
                    int indexProject = scanner.nextInt();
                    removeProject(indexProject);
                    break;
                case 5:
                    displayTasks();
                    break;
                case 6:
                    displayProjects();
                    break;
                case 7:
                    displayChangeLog();
                    break;
                case 0:
                    isApplicationRun = false;
                    break;
                default:
                    ;
                    System.out.println("Nie ma takiej opcji");
                    break;
            }
        }
    }
}
