import entities.Student;

import java.util.Scanner;

public class Console {
    private static  StudentManager studentManager=new StudentManager();

    public static void main(String[] args) {
        System.out.println("Main Menu:\n" +
                "\n" +
                "Option 1: Manage Students\n" +
                "Option 2: Manage Courses\n" +
                "Option 3: Manage Enrollments\n" +
                "Option 4: Exit");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice ");
        int choice=sc.nextInt();
        sc.nextLine();
        switch (choice){
            case 1:
                studentManager.manage();
                break;
            case 2:
                System.out.println("Manage Courses ");

                break;
            case 3:
                System.out.println("Manage Enrollments ");
                break;
            default:
                System.out.println("Exit ");
                break;
        }
        sc.close();

    }
}
