package repo;

import entities.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CourseRepo {
    private List<Course> courseList=new ArrayList<>();

    public List<Course> addCourse(Course course){
        courseList.add(course);
        return courseList;
    }
    public List<Course> removeCourse(Long id){
        Optional<Course> courseToRemoved=courseList.stream().filter(c->c.getId()==id).findFirst();
        if(courseToRemoved.isEmpty()) return null;
        courseList.remove(courseToRemoved);
        return courseList;
    }
    public List<Course> getCourseList(){
        return this.courseList;
    }
    public  Course getCourseByID(Long id){
        Optional<Course> course=this.courseList.stream().filter(c->c.getId()==id).findFirst();
        return course.orElse(null);
    }
}
