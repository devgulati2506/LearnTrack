import entities.Student;
import services.StudentService;

import java.util.Scanner;

public class StudentManager {
    private StudentService studentService;
    private static  Scanner sc;

    public StudentManager(){
         this.studentService=new StudentService();
    }

    public void manage(Scanner sc) {
        this.sc=sc;
        boolean running = true;
        while (running) {
            System.out.println("Manage Students Menu:\n" +
                    "\n" +
                    "Option 1: Add New Student\n" +
                    "Option 2: View All Students\n" +
                    "Option 3: Search Student by ID\n" +
                    "Option 4: Deactivate a Student\n" +
                    "Option 5: Back to Main Menu ");
            System.out.println("Enter your choice ");
            int choice = sc.nextInt();
            String name=sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Add New Student ");
                    addStudent();
                    break;
                case 2:
                    System.out.println("View All Students ");
                    viewStudents();
                    break;
                case 3:
                    System.out.println("Search Student by ID ");
                    System.out.println("Enter Id to be searched");
                    int idEntered=sc.nextInt();
                    Student student=getStudentByID(idEntered);
                    if (student != null) {
                        System.out.println(student);
                    }else{
                        System.out.println("Student Not found !!");
                    }
                    break;
                case 4:
                    System.out.println("Deactivate a Student");
                    deactivateStudent();
                    break;
                case 5:
                    System.out.println("Back to Main Menu ");
                    running=false;
                    break;

                default:
                    System.out.println("Exit");
                    running=false;
                    break;
            }

        }
    }
    public Student  getStudentByID(int idEntered){
       Student student=  studentService.getStudentByID(idEntered);
       return student;
    }
    public void  deactivateStudent(){
        System.out.println("Enter Id to be searched");
        int idEntered=sc.nextInt();
        Student student=getStudentByID(idEntered);
        if(student==null){
            System.out.println("Student Not Found !!");
        }
        student.setActive(false);
    }
    public void viewStudents(){
        System.out.println(studentService.getAllStudents());
    }
    public void addStudent(){
        System.out.println("Enter name:");
        String name=sc.nextLine();

        System.out.println("Enter last  name:");
        String lastname=sc.nextLine();
        System.out.println("Enter email:");
        String email=sc.nextLine();
        System.out.println("Enter batch:");
        String batch=sc.nextLine();

        studentService.addStudent(new Student(name,lastname,email,batch,true));

    }
}
