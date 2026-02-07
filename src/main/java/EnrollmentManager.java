import entities.Course;
import entities.Enrollment;
import entities.Student;
import enums.EnrollmentStatus;
import repo.StudentRepository;
import services.CourseService;
import services.EnrollmentService;
import services.StudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnrollmentManager {
    private Scanner sc;
    private EnrollmentService enrollmentService;
    private StudentService studentService;
    private CourseService courseService;
    EnrollmentManager(){
        enrollmentService=new EnrollmentService();
        studentService=new StudentService();
        courseService=new CourseService();
    }
    public void manage(Scanner sc) {
        this.sc=sc;
        boolean running = true;
        while (running) {
            System.out.println("Manage Enrollments Menu:\n" +
                    "\n" +
                    "Option 1: Enroll a student in a course \n" +
                    "Option 2: View enrollments for a student \n" +
                    "Option 3: Mark enrollment as 0 for  completed, 1 for cancelled \n" +
                    "Option 4: Back to Main Menu ");
            System.out.println("Enter your choice ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addEnrollment();
                    break;
                case 2:

                    viewEnrollment();
                    break;
                case 3:
                    System.out.println("Deactivate a courses");
                    break;
                case 4:
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
    public void addEnrollment(){
        System.out.println("Enter studentID");
        int studentID=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter courseID");
        int courseID=sc.nextInt();
        sc.nextLine();
        Student student=this.studentService.getStudentByID(studentID);
        Course course=this.courseService.getCourseByID(courseID);
        if(student==null) {
            System.out.println("Student not present !!");
            return ;
        }
        if(course==null){
            System.out.println("Course not present");
            return ;
        }


        this.enrollmentService.addEnrollment(
                new Enrollment(studentID,courseID,EnrollmentStatus.COMPLETED));

    }
    public void viewEnrollment(){
        this.enrollmentService.viewEnrollment();
    }
}
