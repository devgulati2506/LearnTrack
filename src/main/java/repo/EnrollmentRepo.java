package repo;

import entities.Enrollment;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentRepo {
    private List<Enrollment> enrollmentList=new ArrayList<>();

    public void  addEnrollment(Enrollment enrollment){
        List<Enrollment> studentEnrollment=enrollmentList.stream().filter(e->e.getStudentID()==enrollment.getStudentID()).toList();
        if(studentEnrollment.size()==0) {
            enrollmentList.add(enrollment);
        return ;
        }
        List<Enrollment> sameCourseID=studentEnrollment.stream().filter(e->e.getStudentID()==enrollment.getStudentID()).toList();
        if(sameCourseID.size()>0){
            System.out.println("Student Already Enrolled!!");
            return ;
        }
        enrollmentList.add(enrollment);
    }
    public List<Enrollment> viewEnrollment(){
        return this.enrollmentList;
    }
}
