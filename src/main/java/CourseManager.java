import entities.Course;
import entities.Student;
import services.CourseService;
import services.StudentService;

import java.util.Scanner;

public class CourseManager {
    private CourseService courseService;
    private static  Scanner sc;

    public CourseManager(){
         this.courseService=new CourseService();
    }

    public void manage(Scanner sc) {
        this.sc=sc;
        boolean running = true;
        while (running) {
            System.out.println("Manage Course Menu:\n" +
                    "\n" +
                    "Option 1: Add new course\n" +
                    "Option 2: View all courses\n" +
                    "Option 3: Deactivate a courses\n" +
                    "Option 4: Back to Main Menu ");
            System.out.println("Enter your choice ");
            int choice = sc.nextInt();
            String name=sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Add New course ");
                    addCourse();
                    break;
                case 2:
                    System.out.println("View All courses ");
                    viewCourse();
                    break;
                case 3:
                    System.out.println("Deactivate a courses");
                    deactivateCourse();
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
    public Course  getCourseByID(int idEntered){
        Course course=  courseService.getCourseByID(idEntered);
       return course;
    }
    public void  deactivateCourse(){
        System.out.println("Enter Id to be searched");
        int idEntered=sc.nextInt();
        Course course=getCourseByID(idEntered);
        if(course==null){
            System.out.println("Course Not Found !!");
            return ;
        }
        course.setActive(false);
    }
    public void viewCourse(){
        System.out.println(courseService.getCourseList());
    }
    public void addCourse(){
            System.out.println("Enter course:");
            String course = sc.nextLine();

            System.out.println("Enter   desc:");
            String desc = sc.nextLine();
            System.out.println("Enter durationInWeeks:");
            int durationInWeeks=0;
        try {
            durationInWeeks = sc.nextInt();
        }catch (Exception e){
            e.printStackTrace();
        }
            courseService.addCourse(new Course(course, desc, durationInWeeks, true));

    }
}
