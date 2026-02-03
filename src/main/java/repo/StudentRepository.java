package repo;

import entities.Course;
import entities.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentRepository {

    List<Student> studentLs=new ArrayList<>();

public List<Student> addStudent(Student student){
    studentLs.add(student);
    return studentLs;
}
    public List<Student> getAllStudents(){
        return this.studentLs;
    }
    public List<Student> removeStudent(Long id){
        Optional<Student> studentToRemoved=studentLs.stream().filter(s->s.getId()==id).findFirst();
        if(studentToRemoved.isEmpty()) return null;
        studentLs.remove(studentToRemoved);
        return studentLs;
    }
}
