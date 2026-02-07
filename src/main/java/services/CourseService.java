package services;

import entities.Course;
import entities.Student;
import repo.CourseRepo;
import repo.StudentRepository;

import java.util.List;

public class CourseService {
    CourseRepo courseRepo;
    public CourseService(){
       this.courseRepo=new CourseRepo();
    }
    public Course getCourseByID(Long id){
        return this.courseRepo.getCourseByID(id);
    }


    public List<Course>addCourse(Course course){
      return   this.courseRepo.addCourse(course);
    }

    public List<Course> removeCourse(Long id){
        return this.courseRepo.removeCourse(id);
    }
    public List<Course> getCourseList(){
        return this.courseRepo.getCourseList();
    }
}
