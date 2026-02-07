package services;

import entities.Enrollment;
import enums.EnrollmentStatus;
import repo.EnrollmentRepo;

import java.util.List;

public class EnrollmentService {
    private EnrollmentRepo enrollmentRepo=new EnrollmentRepo();
    public void addEnrollment(Enrollment enrollment){
         this.enrollmentRepo.addEnrollment(enrollment);
    }
    public List<Enrollment> viewEnrollment(){
        return this.enrollmentRepo.viewEnrollment();
    }
}
