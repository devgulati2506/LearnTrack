import entities.Student;

import java.util.Scanner;

public class Console {
    private static  StudentManager studentManager=new StudentManager();
    private static CourseManager courseManager=new CourseManager();
    private static  Scanner sc ;

    public static void main(String[] args) {
        boolean running =true;
        while (running) {
            System.out.println("Main Menu:\n" +
                    "\n" +
                    "Option 1: Manage Students\n" +
                    "Option 2: Manage Courses\n" +
                    "Option 3: Manage Enrollments\n" +
                    "Option 4: Exit");
            sc = new Scanner(System.in);
            System.out.println("Enter your choice ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    studentManager.manage();
                    break;
                case 2:
                    System.out.println("Manage Courses ");
                    courseManager.manage();
                    break;
                case 3:
                    System.out.println("Manage Enrollments ");
                    break;
                default:
                    System.out.println("Exit ");
                    running=false;
                    break;
            }
        }

        sc.close();

    }
}
