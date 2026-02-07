package services;

import entities.Student;
import repo.StudentRepository;

import java.util.List;

public class StudentService {
    StudentRepository studentRepository;
    public StudentService(){
       this.studentRepository=new StudentRepository();
    }
    public Student getStudentByID(int id){
        return this.studentRepository.getStudentByID(id);
    }


    public List<Student>addStudent(Student student){
      return   this.studentRepository.addStudent(student);
    }

    public List<Student> removeStudent(Long id){
        return this.studentRepository.removeStudent(id);
    }
    public List<Student> getAllStudents(){
        return this.studentRepository.getAllStudents();
    }
}
